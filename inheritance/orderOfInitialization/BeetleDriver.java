package code.inheritance.orderOfInitialization;

public class BeetleDriver {

    /**
     * Drives the program.  What happens?
     * <p>
     * What if we put this main method in a separate file? (Try it!)
     * <p>
     * What if we declare a variable of type Beetle without
     * actually initializing a Beetle object?
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Started program");
        Beetle b;
    }
}
