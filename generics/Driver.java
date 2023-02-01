package code.generics;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Driver.
 *
 * @author BCIT
 * @version 2020
 */
public class Driver {

    /**
     * Returns the sum of the two largest integers in the
     * specified array of integers.
     *
     * @param array of ints
     * @return sum
     * @pre code.arrays length >= 2
     */
    public static int getSumOfTwoLargest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array too small");
        }
        Arrays.sort(array);
        return array[array.length - 1] + array[array.length - 2];
    }

    /**
     * Drives the program.
     *
     * @param args
     */
    public static void main(String[] args) {

        int[] arrayOne = {2, 1};
        int[] arrayTwo = {2, 5, 3, 1};
        int[] arrayThree = {2, 4, 6, 8, 10, 12, 14};
        int[] arrayFour = {14, 12, 10, 8, 10, 12, 14};
        int[] arrayFive = {8, 8, 8, 8, 8, 8};

        System.out.println(getSumOfTwoLargest(arrayOne) + " should be 3");
        System.out.println(getSumOfTwoLargest(arrayTwo) + " should be 8");
        System.out.println(getSumOfTwoLargest(arrayThree) + " should be 26");
        System.out.println(getSumOfTwoLargest(arrayFour) + " should be 28");
        System.out.println(getSumOfTwoLargest(arrayFive) + " should be 16");


        // Test the OrderedPair constructor
        OrderedPair<String, String> pairOfStrings = new OrderedPair<>("Hello", "World");
        OrderedPair<Integer, ArrayList<Integer>> integers = new OrderedPair<>(1, new ArrayList<>());
        OrderedPair<Box<Double>, Box<Double>> boxesOfDoubles = new OrderedPair<>(new Box<Double>(), new Box<Double>());

        // Test the static equivalent method
        OrderedPair<Integer, Integer> ones = new OrderedPair<>(1, 1);
        OrderedPair<Integer, Integer> twos = new OrderedPair<>(2, 2);
        OrderedPair<Integer, Integer> moreOnes = new OrderedPair<>(1, 1);

        System.out.println(OrderedPair.equivalent(ones, twos));
        System.out.println(OrderedPair.equivalent(ones, moreOnes));
        System.out.println(OrderedPair.equivalent(ones, twos));
    }
}
