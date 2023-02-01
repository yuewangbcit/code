package code.generics;


import java.util.ArrayList;

/**
 * Adding numbers.
 *
 * @author BCIT
 * @version 2020
 */
public class TotalNumbers {

    /**
     * Drives the program.
     * @param args
     */
    public static void main(String args[]) {
        // create, initialize and output ArrayList of Numbers containing
        // both Integers and Doubles, then display total of the elements
        Number[] numbers = { 1, 2.4, 3, 4.1 }; // Integers and Doubles
        ArrayList<Number> numberList = new ArrayList<Number>();

        for (Number element : numbers)
            numberList.add(element); // place each number in numberList

        System.out.printf("numberList contains: %s\n", numberList);
        System.out.printf("Total of the elements in numberList: %.1f\n", sum(numberList));
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