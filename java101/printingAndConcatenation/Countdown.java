package code.java101.printingAndConcatenation;

/**
 * Demonstrates the difference between print and println.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class Countdown {

    /**
     * Prints two lines of output representing a rocket countdown.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        System.out.print("Three... ");
        System.out.print("Two... ");
        System.out.print("One... ");
        System.out.print("Zero... ");
        System.out.println("Liftoff!");
        System.out.println();
        System.out.println("Houston, we have a problem.");
    }
}

