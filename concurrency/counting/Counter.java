package code.concurrency.counting;

import java.util.Random;

/**
 * Counter.
 *
 * @author BCIT
 * @version 2022
 */
public class Counter {

    private int value;
    private final Random randomGenerator;

    /**
     * Constructs an object of type Counter.
     */
    public Counter() {
        value = 0;
        randomGenerator = new Random();
    }

    /**
     * Counts to 10, interleaving a big dramatic pause between each value.
     */
    public void count() {
        int count = 0;
        final int upperBound = 10;
        try {
            while (count < upperBound) {
                // A silly way to increment the value but trying to make a point here!
                value = foo(value);

                // Generates a random number between 0 and 5 to sleep for up to .5 seconds
                Thread.sleep(randomGenerator.nextInt(6) * 100);

                count++;
            }

        } catch (InterruptedException e) {
            // Permits the  method to terminate gracefully if thread is interrupted
        }
    }

    /**
     * Returns the value.
     * @return value an int
     */
    public int get() {
        return value;
    }

    /**
     * Pauses for a moment, and returns 1 + the argument.
     * @param n an int
     * @return n + 1
     * @throws InterruptedException if the Thread cannot sleep
     */
    private int foo(final int n) throws InterruptedException {
        // generate a random number between 0 and 5 to
        // sleep for up to .5 seconds
        Thread.sleep(randomGenerator.nextInt(6) * 100);
        return n + 1;
    }

}
