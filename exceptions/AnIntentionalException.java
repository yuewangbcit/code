package code.exceptions;

/**
 * Demonstrates an uncaught exception.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public final class AnIntentionalException {

    private AnIntentionalException() {

    }

    /**
     * Deliberately divides by zero to produce an exception.
     *
     * @param args command line arguments (unused)
     */
    public static void main(final String[] args) {
        final int numerator = 10;
        final int denominator = 0;

        System.out.println(numerator / denominator);

        System.out.println("This text will not be printed.");
    }
}

