package code.exceptions;

/**
 * A simple Exception.
 *
 * @author BCIT
 * @version 2020
 */
class SimpleException extends Exception {
}

/**
 * A simple class.
 */
class ExceptDemo {

    /**
     * Throws an exception.
     */
    public void f() throws Exception {
        System.out.println("Throwing SimpleException from f()");
        throw new SimpleException();
    }

}

/**
 * A simple demo of an overridden method in an Exception.
 *
 * @author BCIT
 * @version 2020
 */
public class SimpleExceptionDemo
        extends ExceptDemo {

    /**
     * Throws an Exception.
     * @throws SimpleException all the time
     */
    public void f() throws SimpleException {
        System.out.println("Throwing SimpleException from glisten()");
        throw new SimpleException();
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        SimpleExceptionDemo sed = new SimpleExceptionDemo();
        try {
            sed.f();
        } catch (Exception e) {
            System.err.println("Caught it!");
        }
    }
}