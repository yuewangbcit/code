package code.java101.arrays;

import java.util.Arrays;

/**
 * Demonstrates the use of the Java array.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class UsingArrays {

    private final int[] intArray = {1, 2, 3, 4, 5, 6};
    private final double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
    private final int[] filledIntArray;
    private final int[] intArrayCopy;

    /**
     * Constructs an object of type UsingArrays.
     */
    public UsingArrays() {
        filledIntArray = new int[10]; // create int array with 10 elements
        intArrayCopy = new int[intArray.length];

        Arrays.fill(filledIntArray, 7); // fill with 7s
        Arrays.sort(doubleArray); // sort doubleArray ascending

        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
    }

    /**
     * Drives the program.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String args[]) {

        final UsingArrays usingArrays = new UsingArrays();
        usingArrays.printArrays();
        usingArrays.printEquality();

        int location = usingArrays.searchForInt(5);
        if (location >= 0)
            System.out.printf("Found 5 at element %d in intArray\n", location);
        else
            System.out.println("5 not found in intArray");

        location = usingArrays.searchForInt(8763);
        if (location >= 0)
            System.out.printf("Found 8763 at element %d in intArray\n", location);
        else
            System.out.println("8763 not found in intArray");
    }

    /**
     * Prints the arrays.
     */
    public void printArrays() {
        System.out.print("doubleArray: ");
        for (double doubleValue : doubleArray)
            System.out.printf("%.1f ", doubleValue);

        System.out.print("\nintArray: ");
        for (int intValue : intArray)
            System.out.printf("%d ", intValue);

        System.out.print("\nfilledIntArray: ");
        for (int intValue : filledIntArray)
            System.out.printf("%d ", intValue);

        System.out.print("\nintArrayCopy: ");
        for (int intValue : intArrayCopy)
            System.out.printf("%d ", intValue);

        System.out.println("\n");
    }

    /**
     * Searches for the specified integer.
     * @param value the integer to find
     * @return the index, or -1 if not found
     */
    public int searchForInt(int value) {
        return Arrays.binarySearch(intArray, value);
    }

    /**
     * Demonstrates the static equals method in the Arrays class.
     */
    public void printEquality() {
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("intArray %s intArrayCopy\n", (b ? "==" : "!="));

        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("intArray %s filledIntArray\n", (b ? "==" : "!="));
    }
}