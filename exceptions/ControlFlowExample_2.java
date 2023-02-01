package code.exceptions;

/**
 * What happens when this executes?
 *
 * @author BCIT
 * @version 2020
 */
public class ControlFlowExample_2 {
    /**
     * Throws an exception.
     * @throws Exception always thrown
     */
    public void bar() throws Exception {
        throw new Exception();
    }

    /**
     * Throws an exception.
     * @throws Exception always thrown
     */
    public void foo() throws Exception {
        try {
            System.out.println("foo");
            bar();
        } finally {
            System.out.println("finally");
        }
        System.out.println("done foo");
    }

    /**
     * Drives the program.
     * @param args unused
     * @throws Exception is thrown
     */
    public static void main(String[] args) throws Exception {
        ControlFlowExample_2 ee = new ControlFlowExample_2();
        ee.foo();
    }
}