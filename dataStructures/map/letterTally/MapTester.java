package code.dataStructures.map.letterTally;

import java.util.HashMap;
import java.util.Map;

/**
 * MapTester.
 *
 * @author BCIT
 * @version 2020
 */
public class MapTester {

    private HashMap<Character, Integer> letterCount;

    /**
     * Constructor for objects of type MapTester.
     */
    public MapTester() {
        letterCount = new HashMap<>();
    }

    /**
     * Counts and reports the number of each letter in a specified sentence.
     *
     * @param sentence A string
     */
    public void countLetters(String sentence) {
        for (int i = 0; i < sentence.length(); i++) {
            if (letterCount.containsKey(sentence.charAt(i))) {
                letterCount.put(sentence.charAt(i), letterCount.get(sentence.charAt(i)) + 1);
            } else {
                letterCount.put(sentence.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
