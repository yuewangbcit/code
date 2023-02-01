package code.exceptions;

/**
 * A custom checked Exception.
 */
class Annoyance extends Exception {
}

/**
 * A custom checked Exception.
 */
class Sneeze extends Annoyance {
}

/**
 * What is happening here?
 *
 * @author BCIT
 * @version 2020
 */
public class CatchingOrderMatters {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        try {
            throw new Sneeze();
            // throw new Annoyance();
        } catch (Sneeze s) {
            System.err.println("Caught Sneeze");
        } catch (Annoyance a) {
            System.err.println("Caught Annoyance");
        }
    }
}