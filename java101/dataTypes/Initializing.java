package code.java101.dataTypes;

/**
 * Demonstrates declaration and initialization.
 * Local variables must be initialized!
 *
 * @author BCIT
 * @version 2022
 */
public final class Initializing {

    // What happens if we take away "static"?
    private static double hourlyWage = 15.50;

    private Initializing() { }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        // double hourlyWage;
        // System.out.println(hourlyWage);

        System.out.println(hourlyWage);
    }
}
