package code.innerClasses;

/**
 * This is a sour egg. It doesn't initialize the Yolk object it contains. The
 * variable yolk will store the value null if we do not instantiate it inside
 * the BadEgg's constructor.
 *
 * @author BCIT
 * @version 2020
 */
public class ChickenEggYolkless {
    private int number;
    private Yolk yolk;

    /**
     * Yolk.
     */
    class Yolk {

        /**
         * Sets the number stored by the enclosing Egg object.
         * @param value
         */
        public void setEggNumber(final int value) {
            number = value;
        }
    }

    /**
     * Drives the program.
     * @param args
     */
    public static void main(final String[] args) {
        ChickenEggYolkless egg = new ChickenEggYolkless();



        egg.yolk.setEggNumber(5);
        System.out.println("number = " + egg.number);
    }
}
