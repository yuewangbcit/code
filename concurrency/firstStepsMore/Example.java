package code.concurrency.firstStepsMore;

/**
 * This is a simple threading example.
 *
 * @author BCIT
 * @version 2022
 */
public final class Example {

    private Example() { }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        RunnableThreadExample instance = new RunnableThreadExample();
        Thread thread = new Thread(instance);
        thread.start();
        final int upperBound = 5;
        while (instance.getCount() != upperBound) {
            try {
                final int duration = 250;
                Thread.sleep(duration);
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }
        }
        System.out.println("Program Terminating.");
    }
}
