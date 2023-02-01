package code.innerClasses;

/**
 * The first of a series of nested class experiments.
 *
 * @author BCIT
 * @version 2020
 */
public class Parcel01 {

    /**
     * Ships this parcel to the specified destination.
     * @param destination as a String
     */
    public void ship(final String destination) {
        Destination d = new Destination(destination);
        System.out.println(d.readLabel());
    }

    class Destination {
        private String label;

        Destination(final String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        Parcel01 p = new Parcel01();
        p.ship("Tasmania");
    }
}
