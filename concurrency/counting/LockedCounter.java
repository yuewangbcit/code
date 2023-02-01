package code.concurrency.counting;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Counter. This example demonstrates the use of
 * Locks to synchronize critical sections of code.
 *
 * @author BCIT
 * @version 2022
 */
public class LockedCounter extends Counter {

    private final Lock myLock;
    private int value;
    private final Random randomGenerator;

    /**
     * Constructs an object of type LockedCounter.
     */
    public LockedCounter() {
        value = 0;
        randomGenerator = new Random();
        myLock = new ReentrantLock();
    }

    /**
     * Counts to 10, interleaving a big dramatic pause between each value.
     */
    public void  count() {
        myLock.lock();
        int count = 0;
        final int upperBound = 10;
        try {
            while (count < upperBound) {
                // silly way to increment the value, but we're trying
                // to make a point here!
                value = foo(value);

                // generate a random number between 0 and 5 to
                // sleep for up to .5 seconds
                Thread.sleep(randomGenerator.nextInt(6) * 100);

                count++;
            }

        } catch (InterruptedException e) {
            // allow method to terminate if thread is interrupted
        } finally {
            myLock.unlock();
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
     * @throws InterruptedException if Thread cannot sleep
     */
    private int foo(final int n) throws InterruptedException {
        // generate a random number between 0 and 5 to
        // sleep for up to .5 seconds
        Thread.sleep(randomGenerator.nextInt(6) * 100);
        return n + 1;
    }
}
