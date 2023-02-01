package code.innerClasses;

/**
 * A very large egg.
 */
class OstrichEgg {

    private Yolk yolk;

    /**
     * Creates an object of type OstrichEgg.
     */
    OstrichEgg() {
        System.out.println("Instantiating an OstrichEgg!");
        yolk = new Yolk();
    }

    /**
     * Sets the OstrichEgg's yolk.
     * @param newYolk a Yolk
     */
    public void setYolk(final Yolk newYolk) {
        yolk = newYolk;
    }

    /**
     * Some silly method that asks the inner object to do something.
     */
    public void asksYolkToAct() {
        yolk.act();
    }

    /**
     * A Yolk belongs to an instance of an OstrichEgg.
     */
    protected class Yolk {
        public Yolk() {
            System.out.println("Creating a Yolk inside an OstrichEgg!");
        }

        public void act() {
            System.out.println("An OstrichEgg's Yolk has been asked to do something!");
        }
    }
}

/**
 * A MegaOstrichEgg is a large OstrichEgg. It contains a MegaYolk.
 *
 * @author BCIT
 * @version 2020
 */
public class MegaOstrichEgg extends OstrichEgg {

    /**
     * Creates an object of type MegaOstrichEgg.
     */
    public MegaOstrichEgg() {
        setYolk(new MegaYolk());
    }

    /**
     * A MegaOstrichEgg Yolk is a specialized version of the OstrichEgg Yolk.
     */
    public class MegaYolk extends Yolk {

        /**
         * Creates an object of type MegaYolk.
         */
        public MegaYolk() {
            System.out.println("Creating a MegaYolk for a MegaOstrichEgg instance.");
        }

        /**
         * A silly helper method.
         */
        public void f() {
            System.out.println("The MegaOstrichEgg's MegaYolk has invoked a helper method.");
        }
    }

    /**
     * Drives the program.
     *
     * Why is this printed twice: "Creating a Yolk inside an OstrichEgg!"
     *
     * What could we do to prevent this from being printed twice? What does it mean, anyway?
     * Is it important?
     *
     * @param args unused
     */
    public static void main(final String[] args) {
        OstrichEgg e2 = new MegaOstrichEgg();
        e2.asksYolkToAct();
    }
}
