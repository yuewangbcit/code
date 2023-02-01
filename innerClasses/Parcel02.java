package code.innerClasses;

/**
 * The second of a series of nested class experiments.
 *
 * @author BCIT
 * @version 2020
 */
public class Parcel02 {

    /**
     * Creates and returns a new Destination object from the provided String.
     * @param destination as a String
     * @return newDestination a Destination object
     */
    public Destination createDestination(final String destination) {
        return new Destination(destination);
    }

    /**
     * Returns a new Content object.
     * @param contents an Object
     * @return newContent a Content that contains contents
     */
    public Contents contents(final Object contents) {
        return new Contents(contents);
    }

    /**
     * Ships the specified payload to the specified receiver.
     * @param payload an Object
     * @param receiver a String
     */
    public void ship(final Object payload, final String receiver) {
        Contents contents = contents(payload);
        Destination destination = createDestination(receiver);
        System.out.println(destination.readLabel());
    }

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
        Parcel02 parcel = new Parcel02();
        parcel.ship( "Take me to your DJ", "Reykjavík");

        Parcel02 anotherParcel = new Parcel02();
        final int luckyNumber = 7;
        Contents contents = anotherParcel.contents(luckyNumber);
        Destination destination = anotherParcel.createDestination("Tokyo");
    }
}
