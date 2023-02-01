package code.exceptions;

/**
 * What happens when this executes?
 *
 * @author BCIT
 * @version 2020
 */
public class ControlFlowExample_3 {

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
            System.out.println("Inside foo, about to call bar");
            bar();
            System.out.println("Back inside foo after having called bar");
        } catch (Exception e) {
            System.out.println("exception caught");
            throw e;
        } finally {
            System.out.println("inside the finally block");
        }
        System.out.println("finished foo");
    }

    /**
     * Does this throw an exception too?
     */
    public void gozaimasu() {
        try {
            System.out.println("gozaimasu");
            foo();
        } catch (Exception e) {
            System.out.println("gozaimasu method caught an exception and crash averted");
        }
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        ControlFlowExample_3 demo = new ControlFlowExample_3();
        demo.gozaimasu();
    }
}
