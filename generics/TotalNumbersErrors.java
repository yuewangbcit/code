package code.generics;

import java.util.ArrayList;

/**
 * Adds all numbers.  Or does it?
 *
 * @author BCIT
 * @version 2020
 */
public class TotalNumbersErrors {

    /**
     * Drives the program.
     *
     * @param args
     */
    public static void main(String[] args) {
        // create, initialize and output ArrayList of Integers
        // then display total of the elements
        Integer[] integers = {1, 2, 3, 4};
        ArrayList<Integer> integerList = new ArrayList<Integer>();

        for (Integer element : integers)
            integerList.add(element); // place each number in integerList

        System.out.printf("integerList contains: %s\n", integerList);
        //System.out.printf("Total of the elements in integerList: %.1f\n", sum(integerList));
    }

    /**
     * Accepts a list of Number and returns the sum.
     *
     * @param list of Number
     * @return sum as a double
     */
    public static double sum(ArrayList<Number> list) {
        double total = 0; // initialize total

        // calculate sum
        for (Number element : list)
            total += element.doubleValue();

        return total;
    }
}
