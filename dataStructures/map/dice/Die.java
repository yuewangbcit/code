package code.dataStructures.map.dice;

import java.util.Random;

/**
 * Die.  This die has 6 sides.
 *
 * @author BCIT
 * @version 2020
 */
public class Die {

    /**
     * This die has 6 sides.
     */
    public static final int NUMBER_OF_SIDES = 6;
    private static final Random RANDOM_NUMBER_GENERATOR = new Random();

    private int faceValue;

    /**
     * Constructor for objects of type Die.
     */
    public Die() {
        faceValue = RANDOM_NUMBER_GENERATOR.nextInt(NUMBER_OF_SIDES) + 1;

    }

    /**
     * Rolls the Die and returns the new face value.
     *
     * @return the new face value as an int
     */
    public int roll() {
        faceValue = RANDOM_NUMBER_GENERATOR.nextInt(NUMBER_OF_SIDES) + 1;
        return faceValue;
    }

    /**
     * Returns a String representation of this Die.
     *
     * @return representation as a String
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "Die [faceValue=" + faceValue + "]";
    }
}
