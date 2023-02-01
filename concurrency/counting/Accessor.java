package code.concurrency.counting;

/**
 * Accessor extends Thread.
 *
 * @author BCIT
 * @version 2022
 */
public class Accessor extends Thread {

    private final Counter counter;

    /**
     * Constructs an object of type Accessor.
     * @param name a String
     * @param theCounter a Counter
     */
    public Accessor(final String name, final Counter theCounter) {
        super(name);
        counter = theCounter;
    }

    /**
     * Executes the thread by asking the counter to count.
     */
    public void run() {
        counter.count();
    }

}
