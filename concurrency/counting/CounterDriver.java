package code.concurrency.counting;

/**
 * CounterDriver.
 *
 * @author BCIT
 * @version 2022
 */
public final class CounterDriver {

    private CounterDriver() { }

    /**
     * Drives the program.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {
        // We need a counter
        Counter counter = new Counter();
        // Counter counter = new LockedCounter(); // This is better

        // We want to increment counter to 20 by using two
        // separate threads
        Accessor one = new Accessor("one", counter);
        Accessor two = new Accessor("two", counter);

        // Start the threads
        one.start();
        two.start();
        try {
            // Wait for each thread to finish and print the result
            one.join();
            two.join();
            System.out.println("The counter's value is " + counter.get()
                    + ", the expected value is 20");
        } catch (InterruptedException ie) {
            System.err.println("Error during join");
        }
    }
}
