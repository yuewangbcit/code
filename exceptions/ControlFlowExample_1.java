package code.exceptions;

/**
 * What's happening here?
 *
 * @author BCIT
 * @version 2020
 */
public class ControlFlowExample_1 {

    /**
     * Throws an exception.
     * @throws Exception always thrown
     */
    public void f() throws Exception {
        throw new Exception();
    }

    /**
     * I think this throws an Exception.  But what happens first?
     * @throws Exception of some sort is thrown, somehow, eventually...
     */
    public void foo() throws Exception {
        System.out.println("starting foo");
        try {
            System.out.println("in try before glisten()");
            f();
            System.out.println("in try after glisten()");
        } catch (Exception e) {
            System.out.println("exception occurred");
            throw e;
        } finally {
            System.out.println("finally");
        }
        System.out.println("after finally");
    }

    /**
     * Drives the program.
     * @param args unused
     * @throws Exception in a circuitous way
     */
    public static void main(String[] args) throws Exception {
        ControlFlowExample_1 c = new ControlFlowExample_1();
        try {
            c.foo();
        } finally {
            System.out.println("main finally");
        }
    }
}