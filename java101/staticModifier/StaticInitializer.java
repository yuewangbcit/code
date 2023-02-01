package code.java101.staticModifier;

/**
 * Demonstrates static initialization blocks.
 *
 * @author BCIT
 * @version 2020
 */
public class StaticInitializer {

    /* What does this do? */
    private static int counter = getValue();

    static {
        System.out.println("Inside the static block.");
        System.out.println(counter);
    }

    /**
     * Constructs an object of type StaticInitializer
     */
    public StaticInitializer() {
        System.out.println("Constructing the object.");
    }

    /**
     * Returns a value.
     *
     * @return an int
     */
    public static int getValue() {
        System.out.println("Entering static method getValue");
        final int returnValue = 10;
        return returnValue;
    }

    /**
     * Drives the program.
     *
     * @param args unused
     */
    public static void main(String[] args) {

        StaticInitializer si = new StaticInitializer();
    }
}
