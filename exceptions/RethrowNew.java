package code.exceptions;

/**
 * A checked exception.
 */
class OneException extends Exception {
    /**
     * Constructs an object of type OneException
     * @param s a description of the exceptional situation
     */
    public OneException(String s) {
        super(s);
    }
}

/**
 * A checked exception.
 */
class TwoException extends Exception {
    /**
     * Constructs an object of type TwoException
     * @param s a description of the exceptional situation
     */
    public TwoException(String s) {
        super(s);
    }
}

/**
 * Demonstrates rethrowing an exception.
 *
 * @author BCIT
 * @version 2020
 */
public class RethrowNew {

    /**
     * Throws an exception.
     * @throws OneException every single time
     */
    public static void f() throws OneException {
        System.out.println("originating the exception in glisten()");
        throw new OneException("thrown from glisten()");
    }

    /**
     * Drives the program.
     * @param args unused
     * @throws TwoException often
     */
    public static void main(String[] args) throws TwoException {
        try {
            f();
        } catch (OneException e) {
            System.err.println("Caught in main, e.printStackTrace()");
            e.printStackTrace(System.err);
            throw new TwoException("from main()");
        }
    }
}