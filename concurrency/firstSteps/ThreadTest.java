package code.concurrency.firstSteps;

/**
 * DCT implements the Runnable interface.  A DCT is a
 * discrete cosine transform.  If you take DigiPro you
 * will use it with Fourier analyses to perform
 * signal transformations.  It is a time-consuming
 * computation.
 *
 * @author BCIT
 * @version 2022
 */
class DCT implements Runnable {

    private double[][] result;
    private final double[][] data;
    private final int runs;

    /**
     * Constructs an object of type DCT.
     *
     * @param d a 2d array of double
     * @param r an int
     */
    DCT(final double[][] d, final int r) {
        data = new double[d.length][d[0].length];
        runs = r;
        for (int i = 0; i < d.length; i++) {
            System.arraycopy(d[i], 0, data[i], 0, data.length);
        }
    }

    /**
     * Implements the dct.
     */
    public void dct() {
        dct(data);
    }

    /**
     * Performs the dct upon the given 2d array of double.
     *
     * @param in a 2d array of double
     */
    public void dct(final double[][] in) {
        int w = in.length;
        int h = in[0].length;
        int u;
        int v;
        double sum;
        result = new double[w][h];
        for (u = 0; u < w; u++) {
            for (v = 0; v < h; v++) {
                sum = 0.0;
                for (int x = 0; x < w; x++) {
                    for (int y = 0; y < h; y++) {
                        sum += in[x][y] * Math.cos((2 * x + 1) * u * Math.PI / (2 * w))
                                * Math.cos((2 * y + 1) * v * Math.PI / (2 * h));
                    }
                }
                sum *= 2 / Math.sqrt(h * w) * c(u) * c(v);
                result[u][v] = sum;
            }
        }
    }

    /**
     * Executes this thread.
     */
    public void run() {
        for (int i = 0; i < runs; i++) {
            dct();
            idct();
        }
    }

    /**
     * Implements the idct.
     */
    public void idct() {
        idct(result);
    }

    /**
     * Performs the idct upon the given 2d array of double.
     *
     * @param in a 2d array of double
     */
    public void idct(final double[][] in) {
        int w = in.length;
        int h = in[0].length;
        int x;
        int y;
        double sum;
        double[][] iresult = new double[w][h];
        for (x = 0; x < w; x++) {
            for (y = 0; y < h; y++) {
                sum = 0.0;
                for (int u = 0; u < w; u++) {
                    for (int v = 0; v < h; v++) {
                        sum += in[u][v] * Math.cos((2 * x + 1) * u * Math.PI / (2 * w))
                                * Math.cos((2 * y + 1) * v * Math.PI / (2 * h)) * c(u) * c(v);
                    }
                }
                sum *= 2 / Math.sqrt(h * w);
                iresult[x][y] = sum;
            }
        }
        result = iresult;
    }

    /**
     * Does something interesting. Not really.
     *
     * @param value a double
     * @return sometimes 1, sometimes 1/1.4142
     */
    public double c(final double value) {
        if (value == 0) {
            return 1 / Math.sqrt(2);
        }
        return 1;
    }

    /**
     * Displays the specified 2d double array.
     *
     * @param in a 2d double array
     */
    public void display(final double[][] in) {
        for (double[] doubles : in) {
            for (int j = 0; j < in[0].length; j++) {
                System.out.printf("%3.1f  ", doubles[j]);
            }
            System.out.println();
        }
    }
}

/**
 * ThreadTest.
 *
 * @author BCIT
 * @version 2022
 */
public final class ThreadTest {

    private ThreadTest() { }

    /**
     * What is this madness?
     *
     * @param data       a 2d array of double
     * @param iterations an int
     * @param numThreads an int
     */
    public static void createThreads(final double[][] data,
                                     final int iterations,
                                     final int numThreads) {
        try {
            System.out.println("Number of threads = " + numThreads);
            DCT[] dct = new DCT[numThreads];
            Thread[] t = new Thread[numThreads];
            for (int i = 0; i < numThreads; i++) {
                dct[i] = new DCT(data, iterations / numThreads);
                t[i] = new Thread(dct[i]);
            }
            long start = System.currentTimeMillis();
            for (int j = 0; j < numThreads; j++) {
                t[j].start();
            }
            for (int j = 0; j < numThreads; j++) {
                t[j].join();
            }
            System.out.println("Duration: " + (System.currentTimeMillis() - start) + " ms.");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Drives the program.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {
        double[][] data = {
                {0, 1, 2, 3, 4, 5, 6, 7},
                {0, 1, 2, 3, 4, 5, 6, 7},
                {0, 1, 2, 3, 4, 5, 6, 7},
                {0, 1, 2, 3, 4, 5, 6, 7},
                {0, 1, 2, 3, 4, 5, 6, 7},
                {0, 1, 2, 3, 4, 5, 6, 7},
                {0, 1, 2, 3, 4, 5, 6, 7},
                {0, 1, 2, 3, 4, 5, 6, 7}
        };


        for (int i = 1; i <= 6; i++) {
            createThreads(data, 1200, i);
        }

        int cores = Runtime.getRuntime().availableProcessors();
        createThreads(data, 1200, cores);


    }
}
