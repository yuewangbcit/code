package code.dataStructures.map.letterTally;

import java.util.*;

/**
 * WordTypeCount demonstrates how to use a Map.
 *
 * @author BCIT
 * @version 2020
 */
public class WordTypeCount {

    private Map<String, Integer> map;
    private Scanner scanner;

    /**
     * Constructs an object of type WordTypeCount.
     */
    public WordTypeCount() {
        map = new HashMap<>();
        scanner = new Scanner(System.in);
        createMap();
        displayMap();
    }

    /*
     * Populates the map with some tokens entered by the user.
     */
    private void createMap() {
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(input);
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().toLowerCase();
            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }
    }

    /*
     * Displays the map.
     */
    private void displayMap() {
        Set<String> keys = map.keySet();
        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.println("Map contains:%nKey\t\tValue");
        for (String key : sortedKeys) {
            System.out.printf("%-10s%10s%n", key, map.get(key));
        }

        System.out.printf("%nsize:%d%nisEmpty:%b%n", map.size(), map.isEmpty());
    }

    /**
     * Drives the program.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {
        new WordTypeCount();
    }
}
