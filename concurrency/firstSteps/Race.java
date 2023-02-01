package code.concurrency.firstSteps;

/**
 * Race extends Thread.
 *
 * @author BCIT
 * @version 2022
 */
public class Race extends Thread {

    private static int task = 0;
    private static int jellybeans = 1;

    private final int id = task++;

    /**
     * Returns true if a jellybean is available, else false.
     * What happens if we don't synchronize this method?
     *
     * @return true if a jellybean is available, else false
     */
    // public static synchronized boolean getJellyBean() {
    public static boolean getJellyBean() {

        if (jellybeans != 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            jellybeans--;
            return true;
        }
        return false;
    }

    /**
     * Executes the thread.
     */
    public void run() {
        System.out.println("id=" + id + " attempting to get jellybean");
        System.out.println("id=" + id + " jellybean success=" + getJellyBean());
        System.out.println("id=" + id + " number of jellybeans left=" + jellybeans);
    }

    /**
     * Drives the program.
     *
     * @param args unused
     */
    public static void main(final String[] args) {
        Race r1 = new Race();
        Race r2 = new Race();
        r1.start();
        r2.start();
    }
}
