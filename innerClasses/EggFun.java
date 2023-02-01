package code.innerClasses;

/**
 * Instantiates an Egg.
 *
 * @author BCIT
 * @version 2020
 */
public final class EggFun {

    private EggFun() {
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        new Egg(); // Look at this! I made an object, but didn't assign its reference to a variable.
    }
}

/**
 * Egg.
 */
class Egg {

    private final Yolk yolk;

    /**
     * Creates an object of type Egg.
     */
    Egg() {
        System.out.println("Instantiating a new Egg");
        yolk = new Yolk();
    }

    /**
     * An inner class can be protected, too. What does this mean about its visibility outside of
     * the Egg?
     */
    protected class Yolk {

        /**
         * Creates an object of type Yolk.
         */
        public Yolk() {
            System.out.println("Instantiating an Egg object's personal Yolk");
        }
    }
}

