package code.java101.arrays;

import java.util.Scanner;

/**
 * Demonstrates array index processing.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class ReverseOrder {
    /**
     * How many numbers to read.
     */
    public static final int ARRAY_SIZE = 10;

    /**
     * Scans a list of numbers from the user, storing them in an array, and then
     * prints them in the opposite order.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {

        final double[] numbers = new double[ARRAY_SIZE];
        System.out.println("The size of the array: " + numbers.length);

        final Scanner scan = new Scanner(System.in);
        for (int index = 0; index < numbers.length; index++) {
            System.out.print("Enter number " + (index + 1) + ": ");
            numbers[index] = scan.nextDouble();
        }

        System.out.println("The numbers in reverse order:");
        for (int index = numbers.length - 1; index >= 0; index--) {
            System.out.print(numbers[index] + "  ");
        }

        scan.close();
    }
}

