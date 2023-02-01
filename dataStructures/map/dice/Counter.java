package code.dataStructures.map.dice;

import java.util.HashMap;
import java.util.Map;

/**
 * Counter.
 *
 * @author BCIT
 * @version 2020
 */
public class Counter {

    private Die unbiasedDie;
    private HashMap<Integer, Integer> frequencyTable;

    /**
     * Constructor for objects of type Counter.
     */
    public Counter() {
        unbiasedDie = new Die();
        frequencyTable = new HashMap<>();
    }

    /**
     * Drives the program.
     *
     * @param args not used
     */
    public static void main(final String[] args) {
        Counter counter = new Counter();
        counter.roll(1_000_000);
        System.out.println(counter.toString());
    }

    /**
     * Rolls the Die the specified number of times.
     *
     * @param numberOfRolls an int
     */
    public void roll(final int numberOfRolls) {
        for (int i = 0; i < numberOfRolls; ++i) {
            int newRoll = unbiasedDie.roll();
            if (frequencyTable.get(newRoll) == null) {
                frequencyTable.put(newRoll, 1);
            } else {
                frequencyTable.put(newRoll, frequencyTable.get(newRoll) + 1);
            }
        }
    }

    /**
     * Returns a description of this Counter.
     *
     * @return description as a String
     */
    public String toString() {
        String table = "";
        for (Map.Entry<Integer, Integer> entry : frequencyTable.entrySet()) {
            table += (entry.getKey() + ": " + entry.getValue() + "\n");
        }
        return table;
    }

}
