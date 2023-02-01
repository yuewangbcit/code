package code.innerClasses;

/**
 * The fifth of a series of nested class experiments.
 *
 * @author BCIT
 * @version 2020
 */
public class Parcel05 {

    /* Activates internal tracking when flagged to do so */
    private void internalTracking(final boolean startTracking) {

        if (startTracking) {

            /**
             * A deeply nested class. Neat!
             */
            class TrackingSlip {
                private String id;

                /**
                 * Creates an object of type TrackingSlip
                 * @param uniqueID a String
                 */
                TrackingSlip(final String uniqueID) {
                    id = uniqueID;
                }

                /**
                 * Returns the tracking ID.
                 * @return id as a String
                 */
                String getSlip() {
                    return id;
                }
            }

            TrackingSlip trackingSlip = new TrackingSlip("867-5309-JohnnyBravo-BCIT2");
            String slipID = trackingSlip.getSlip();
        }
        // Why can't I write this here?
        // TrackingSlip ts = new TrackingSlip("SYS 64738");
    }

    /**
     * Activates tracking for this package.
     */
    public void track() {
        internalTracking(true);
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        Parcel05 parcel = new Parcel05();
        parcel.track();
    }
}
