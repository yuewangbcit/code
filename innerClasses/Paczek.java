package code.innerClasses;

/**
 * A Pączek is a Polish doughnut with some sort of jam inside it.
 *
 * @author BCIT
 * @version 2020
 */
public class Paczek {

    /**
     * Tracks the number of pączki made. The plural of pączek is pączki.
     */
    public static int count = 0;

    private Filling filling;
    private double priceZloty;


    /**
     * An inner class can access all the members of the
     * encapsulating object, even the private ones.
     */
    public class Filling {

        /**
         * Creates an instance of the Filling class.
         */
        public Filling() {
            priceZloty = 100;
            count++;
        }
    }
}

/**
 * Demonstrates how to access a public inner object from
 * outside of its encapsulating object.
 */
final class Driver {

    private Driver() {
    }

    /**
     * Note the use of outerObject.new InnerConstructor.
     *
     * @param args
     */
    public static void main(final String[] args) {
        Paczek doughnut = new Paczek();
        Paczek.Filling filling = doughnut.new Filling();
        // Question: what is the value of doughnut.filling?
        // Question: what is the value of doughnut.priceZloty?
        System.out.println(doughnut);
    }
}
