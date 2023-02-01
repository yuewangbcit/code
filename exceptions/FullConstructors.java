package code.exceptions;

/**
 * Custom exception.
 */
class AnotherException extends Exception {
    public AnotherException() {
    }

    public AnotherException(String msg) {
        super(msg);
    }
}

/**
 * What is happening here?
 *
 * @author BCIT
 * @version 2020
 */
public class FullConstructors {
    public static void f() throws AnotherException {
        System.out.println("Throwing AnotherException from glisten()");
        throw new AnotherException();
    }

    public static void g() throws AnotherException {
        System.out.println("Throwing AnotherException from crack()");
        throw new AnotherException("Originated in crack()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (AnotherException e) {
            e.printStackTrace(System.err);
        }
        try {
            g();
        } catch (AnotherException e) {
            e.printStackTrace(System.err);
        }
    }
}