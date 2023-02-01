package code.innerClasses;

/**
 * Represents the layers of 'wrapping' around a parcel.
 *
 * @author BCIT
 * @version 2020
 */
class Wrapping {
    private int layers;

    /**
     * Creates an object of type Wrapping.
     * @param layers an int
     */
    Wrapping(final int layers) {
        this.layers = layers;
    }

    /**
     * Returns the number of layers.
     * @return layers an integer
     */
    public int getNumberOfLayers() {
        return layers;
    }
}

/**
 * The sixth of a series of nested class experiments.
 *
 * @author BCIT
 * @version 2020
 */
public class Parcel06 {

    /**
     * Returns some Wrapping for this Parcel06.
     * @param layers an int
     * @return the specified number of layers of Wrapping around the Parcel06.
     */
    public Wrapping wrapping(final int layers) {

        // Returns a new anonymous extension of the Wrapping class.
        // We have to pass the constructor argument to super:
        return new Wrapping(layers) {

            /**
             * Returns a double layer of wrapping. We have overridden the original method here.
             * @return layers an integer
             */
            public int layers() {
                return super.getNumberOfLayers() * 2;
            }
        };
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        Parcel06 parcel = new Parcel06();
        final int carefulPacker = 3;
        Wrapping wrapping = parcel.wrapping(carefulPacker);
        System.out.println(wrapping.getNumberOfLayers());
    }
}

