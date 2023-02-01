package code.exceptions;

/**
 * A Custom Exception.  This is a good template.
 *
 * @author BCIT
 * @version 2020
 */
class MyException2 extends Exception {

    private int value;

    /**
     * Constructs an object of type MyException2.
     */
    public MyException2() {
    }

    /**
     * Constructs an object of type MyException2.
     * @param msg a description of the exceptional situation.
     */
    public MyException2(String msg) {
        super(msg);
    }

    /**
     * Constructs an object of type MyException2.
     * @param msg a description of the exceptional situation.
     * @param value an int
     */
    public MyException2(String msg, int value) {
        super(msg);
        this.value = value;
    }

    /**
     * Returns the value stored in this Exception
     * @return value as an int
     */
    public int getValue() {
        return value;
    }
}

/**
 * This class is packed with features.
 *
 * @author BCIT
 * @version 2020
 */
public class ControlFlowExample_4 {
    /**
     * Throws an exception.
     * @throws MyException2 every single time
     */
    public static void f() throws MyException2 {
        System.out.println("Throwing MyException2 from f()");
        throw new MyException2();
    }

    /**
     * Throws an exception.
     * @throws MyException2 every single time
     */
    public static void g() throws MyException2 {
        System.out.println("Throwing MyException2 from g()");
        throw new MyException2("Originated in g()");
    }

    /**
     * Throws an exception.
     * @throws MyException2 every single time
     */
    public static void h() throws MyException2 {
        System.out.println("Throwing MyException2 from h()");
        throw new MyException2("Originated in h()", 47);
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        try {
            f();
        } catch (MyException2 e) {
            e.printStackTrace(System.err);
        }
        try {
            g();
        } catch (MyException2 e) {
            e.printStackTrace(System.err);
        }
        try {
            h();
        } catch (MyException2 e) {
            e.printStackTrace(System.err);
            System.err.println("e.val() = " + e.getValue());
        }
    }
}