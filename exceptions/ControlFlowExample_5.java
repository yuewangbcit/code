package code.exceptions;

/**
 * Custom exception.
 */
class MyException extends Exception {
    /**
     * Constructs an object of type MyException.
     */
    public MyException() {
    }

    /**
     * Constructs an object of type MyException.
     * @param msg a description of the exceptional situation.
     */
    public MyException(String msg) {
        super(msg);
    }
}

/**
 * What is happening here?
 *
 * @author BCIT
 * @version 2020
 */
public class ControlFlowExample_5 {
    /**
     * Throws an exception.
     * @throws MyException every single time
     */
    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    /**
     * Throws an exception.
     * @throws MyException every single time
     */
    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.err);
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.err);
        }
    }
}