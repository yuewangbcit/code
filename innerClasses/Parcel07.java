package code.innerClasses;
/**
 * The seventh of a series of nested class experiments. This class uses the Destination interface
 * in the same package.
 *
 * @author BCIT
 * @version 2020
 */
public class Parcel07 {

    private static final double BUDGET_LIMIT = 100.00;

    /**
     * Creates a new Destination from the provided destination String and price in CAD.
     * @param destination a String
     * @param priceCAD a double
     * @return newDestination object for this Parcel07.
     */
    public Destination destination(final String destination, final double priceCAD) {

        // Returns an anonymous implementation of the Destination interface.
        return new Destination() {

            private double cost;
            private String label;

            // This block represents an instance initialization. It's like a constructor.
            {
                label = destination;
                cost = priceCAD;

                if (cost > BUDGET_LIMIT) {
                    System.out.println("Alert! You are over budget!");
                }
            }

            /**
             * Returns this Destination label.
             * @return label as a String
             */
            public String readLabel() {
                return label;
            }
        };
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        Parcel07 parcel = new Parcel07();
        final double unrealisticPrice = 49.95;
        Destination destination =
                parcel.destination("La belle ville de Paris", unrealisticPrice);
    }
}
