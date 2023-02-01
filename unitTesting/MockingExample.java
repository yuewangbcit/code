package code.unitTesting;

import java.util.Random;

/**
 * Demonstrates a simple technique for mocking random numbers.
 *
 * @author BCIT
 * @version 2020
 */
public final class MockingExample {

    private MockingExample() {

    }

    /**
     * Rolls a die with the specified number of side the specified number of times.
     * @param random a Random object (this is called DEPENDENCY INJECTION because
     *               we are injecting the object this method depends on)
     * @param rolls an int
     * @param sides an int
     * @return sum the total of the dice roll(s)
     */
    public static int rollDie(final Random random, final int rolls, final int sides) {
        int sum = 0;
        for (int i = 0; i < rolls; ++i) {
            int roll = random.nextInt(sides);
            System.out.println(roll);
            sum += (1 + roll);
        }
        return sum;
    }

    /**
     * Rolls a die with the specified number of side the specified number of times.
     * @param rolls an int
     * @param sides an int
     * @return sum the total of the dice roll(s)
     */
    public static int rollDie(final int rolls, final int sides) {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < rolls; ++i) {
            int roll = random.nextInt(sides);
            System.out.println(roll);
            sum += (1 + roll);
        }
        return sum;
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        final Random random = new Random();
        final int roll = rollDie(random, 3, 6);
        System.out.println(roll);
        final int anotherRoll = rollDie(3, 6);
        System.out.println(anotherRoll);
    }
}
