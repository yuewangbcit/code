package code.innerClasses;

/**
 * The third of a series of nested class experiments.
 *
 * @author BCIT
 * @version 2020
 */
public class Parcel03 {

    /**
     * Contents encapsulate a payload.
     */
    class Contents {
        private Object payload;

        /**
         * Creates a Contents object to encapsulate the specified payload.
         * @param payload an Object
         */
        Contents(final Object payload) {
            this.payload = payload;
        }

        /**
         * Returns the payload stored in this Contents object.
         * @return payload an Object
         */
        public Object getPayload() {
            return payload;
        }
    }

    /**
     * A Destination stores a label.
     */
    class Destination {
        private String label;

        /**
         * Creates a destination object from the provided destination String.
         * @param destination a String
         */
        Destination(final String destination) {
            label = destination;
        }

        /**
         * Returns this Destination label as a String.
         * @return label as a String
         */
        String readLabel() {
            return label;
        }
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        Parcel03 parcel = new Parcel03();

        /* Note how we MUST use an instance of the new class to instantiate the inner class */
        Contents contents = parcel.new Contents(new Paczek());
        Destination destination = parcel.new Destination("My Tummy");
    }
}
