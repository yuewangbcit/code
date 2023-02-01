package code.dataStructures.map.letterTally;

import java.util.Scanner;

/**
 * Driver.
 *
 * @author BCIT
 * @version 2020
 */
public class Driver {

    /**
     * Constructor for objects of type Driver.
     */
    public Driver() {
    }

    /**
     * Drives the program.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        MapTester letterCount = new MapTester();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();
        letterCount.countLetters(sentence);
        scan.close();
    }

}
