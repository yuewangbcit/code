package code.exceptions;

import java.util.Scanner;

/**
 * Demonstrates an uncommon approach to the instantiation
 * of an Exception object.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class CreatingExceptions {

    /**
     * Creates an exception object and possibly throws it.
     *
     * @param args command line arguments (unused)
     * @throws OutOfRangeException if user input is 'out of range'
     */
    public static void main(String[] args) throws OutOfRangeException {
        final int minimum = 25;
        final int maximum = 40;

        final Scanner scan = new Scanner(System.in);

        final OutOfRangeException problem =
                new OutOfRangeException("Input value is out of range.");

        System.out.print("Enter an integer value between "
                + minimum + " and " + maximum + ", inclusive: ");
        final int value = scan.nextInt();
        scan.close();

        // Determines if the exception should be thrown
        if (value < minimum || value > maximum) {
            throw problem;
        }

        System.out.println("End of main method."); // May never be reached

    }
}

