package code.innerClasses;

/**
 * A ChickenEgg contains an integer and a Yolk. Gobble, gobble.
 *
 * @author BCIT
 * @version 2020
 */
public class ChickenEgg {

    private int number;
    private Yolk yolk;

    /**
     * Constructs an object of type ChickenEgg. Also constructs the
     * Yolk inside it.
     */
    public ChickenEgg() {
        yolk = new Yolk();
    }

    /**
     * Yolk. Every Yolk belongs to a ChickenEgg.
     */
    class Yolk {

        /**
         * Changes the number stored in the encapsulating ChickenEgg.
         * @param value an integer
         */
        public void setNumber(final int value) {
            number = value;
        }
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        ChickenEgg e = new ChickenEgg();
        e.yolk.setNumber(5);
        System.out.println("number = " + e.number);
    }
}

