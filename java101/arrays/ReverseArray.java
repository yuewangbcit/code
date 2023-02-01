package code.java101.arrays;

import java.util.Scanner;

/**
 * ReverseArray uses a swap method.
 *
 * @author BCIT
 * @version 2020
 */
public class ReverseArray {

    /**
     * Swaps the elements at the specified indices in the specified array.
     *
     * @param array    of ints
     * @param indexOne first location to swap
     * @param indexTwo second location to swap
     */
    public static void swap(int[] array, int indexOne, int indexTwo) {
        final int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

    /**
     * Drives the program.
     *
     * @param args unused
     */
    public static void main(String[] args) {

        System.out.println("Enter the size of the array you wish to create:");
        final Scanner scan = new Scanner(System.in);
        final int size = scan.nextInt();
        final int[] array = new int[size];

        for (int i = 0; i < size; ++i) {
            System.out.print("Enter element number " + (1 + i) + ":");
            array[i] = scan.nextInt();
        }

        System.out.println();

        System.out.println("You entered:");
        for (int i = 0; i < size; ++i) {
            System.out.print(array[i] + " ");

        }

        System.out.println();

        System.out.println("Now let's swap:");
        for (int i = 0; i < size / 2; ++i) {
            swap(array, i, size - 1 - i);
        }

        System.out.println("Swapped array is:");
        for (int i = 0; i < size; ++i) {
            System.out.print(array[i] + " ");

        }

        System.out.println();
    }

}
