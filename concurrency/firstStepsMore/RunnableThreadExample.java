package code.concurrency.firstStepsMore;

/**
 * A RunnableThread is a Runnable object.
 *
 * @author BCIT
 * @version 2022
 */
public class RunnableThreadExample implements Runnable {

    private int count;

    /**
     * Executes this thread.
     */
    public void run() {
        System.out.println("RunnableThread starting.");
        try {
            final int upperBound = 5;
            while (count < upperBound) {
                final int duration = 500;
                Thread.sleep(duration);
                System.out.println("RunnableThread count: " + count);
                count++;
            }
        } catch (InterruptedException exc) {
            System.out.println("RunnableThread interrupted.");
        }
        System.out.println("RunnableThread terminating.");
    }

    /**
     * Returns the current count.
     * @return count an int
     */
    public int getCount() {
        return count;
    }
}
