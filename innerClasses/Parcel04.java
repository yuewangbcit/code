package code.innerClasses;

/**
 * The fourth of a series of nested class experiments. This class uses the Destination interface
 * which is in the same package.
 *
 * @author BCIT
 * @version 2020
 */
public class Parcel04 {

    /**
     * Creates and returns a new Destination object from the provided String.
     * @param destination as a String
     * @return newDestination a Destination object
     */
    public Destination destination(final String destination) {

        /**
         * An inner class! This class implements the Destination interface. It's in
         * a separate file in the same package.
         */
        final class PrivateDestination implements Destination {

            private String label;

            private PrivateDestination(final String whereTo) {
                label = whereTo;
            }

            /**
             * Returns this Destination label as a String.
             * @return label as a String
             */
            public String readLabel() {
                return label;
            }
        }

        /* And here is where we instantiate the inner class! */
        return new PrivateDestination(destination);
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        Parcel04 parcel = new Parcel04();
        Destination destination = parcel.destination("Canada");
        // Can you use the debugger to confirm that the destination is, in fact, Canada?
        System.out.println();
    }
}
