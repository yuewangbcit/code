package code.java101.arrays;

/**
 * Demonstrates the use of a two-dimensional array.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class TwoDArray {

    private static final int ROWS = 5;
    private static final int COLUMNS = 7;
    private static final int MULTIPLIER = 10;

    /**
     * Creates a 2D array of integers and fills it with increasing integer
     * values, then prints them out.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        final int[][] table = new int[ROWS][COLUMNS];

        // Populates the table with values
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = row * MULTIPLIER + col;
            }
        }

        // Prints the table
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                System.out.print(table[row][col] + "\t");
            }
            System.out.println();
        }
    }
}

