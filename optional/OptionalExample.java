package code.optional;

import java.util.Optional;
import java.util.Random;

/**
 * OptionalExample demonstrates the Optional mechanism.
 *
 * We often write methods in Java that return a value, or null. Using the Optional
 * container object makes it crystal clear to the user of our code that a method may
 * return nothing and they must deal with it. This is considered cleaner/faster than
 * dealing with NullPointerException objects.
 *
 * @author BCIT
 * @version 2020
 */
public final class OptionalExample {

    private OptionalExample() {

    }

    /**
     * Might return nothing or it might return a String.
     * @return optional String
     */
    public static Optional<String> mightReturnNothing() {
        boolean flipCoin = new Random().nextBoolean();
        if (flipCoin) {
            return Optional.of("Heads you win!"); // This is how we make and fill a new Optional!
        } else {
            return Optional.empty();
        }
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        String value = mightReturnNothing().orElse("Tails you lose");
        System.out.println(value);
    }
}
