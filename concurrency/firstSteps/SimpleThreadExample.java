package code.concurrency.firstSteps;

import java.util.Random;

/**
 * SimpleThreadExample extends Thread.  A Thread is a Runnable.
 * Every Thread must override the run( ) method.  The run( )
 * method is what the JVM invokes when the Thread scheduler
 * gives this thread time on the CPU.
 *
 * @author BCIT
 * @version 2022
 */
public class SimpleThreadExample extends Thread {

    private static int task = 0; // A shared memory location!
    private final int id = task++;

    /**
     * Executes the thread.
     */
    public void run() {
        for (int count = 0; count < 10; count++) {
            try {
                Thread.sleep(1000);
                //Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("id=" + id + " count=" + count);
        }

    }

    /**
     * Drives the program.
     *
     * @param args unused
     */
    public static void main(final String[] args) {
        SimpleThreadExample s1 = new SimpleThreadExample();
        SimpleThreadExample s2 = new SimpleThreadExample();
        s1.start();
        s2.start();

        // If we omit the try-catch-finally block, this main thread
        // will (possibly) finish before the two worker threads.
        try {
            s1.join();
            s2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("All done");
        }
        System.out.println("All done");


    }
}
