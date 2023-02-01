package code.java101.arrays;

/**
 * Demonstrates basic array declaration and use.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class BasicArray {

    private static final int LIMIT = 15;
    private static final int MULTIPLE = 10;
    private static final int CLUNKER = 999;
    private static final int CLUNK_IDX = 5;

    /**
     * Creates an array, fills it with various integer values, modifies one
     * value, then prints the values out.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {

        final int[] list = new int[LIMIT];

        // Initializes the array values
        for (int index = 0; index < LIMIT; index++) {
            list[index] = index * MULTIPLE;
        }

        // Changes one array value
        list[CLUNK_IDX] = CLUNKER;

        // Prints the array values
        for (int value : list) {
            System.out.print(value + "  ");
        }
    }
}

