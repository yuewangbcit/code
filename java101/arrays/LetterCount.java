package code.java101.arrays;

import java.util.Scanner;

/**
 * Demonstrates a relationship between arrays and strings.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class LetterCount {
    /**
     * Number of characters in English alphabet.
     */
    public static final int NUMBER_OF_CHARACTERS = 26;

    /**
     * Reads a sentence from the user and counts the number of uppercase and
     * lowercase letters contained in it.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {

        final Scanner scan = new Scanner(System.in);

        final int[] upper = new int[NUMBER_OF_CHARACTERS];
        final int[] lower = new int[NUMBER_OF_CHARACTERS];

        char current; // the current character being processed
        int other = 0; // counter for non-alphabetics

        System.out.println("Enter a sentence:");
        String line = scan.nextLine();

        // Counts the number of each letter occurrence
        for (int ch = 0; ch < line.length(); ch++) {
            current = line.charAt(ch);
            if (current >= 'A' && current <= 'Z') {
                upper[current - 'A']++;
            } else if (current >= 'a' && current <= 'z') {
                lower[current - 'a']++;
            } else {
                other++;
            }
        }

        // Prints the results
        System.out.println();
        for (int letter = 0; letter < upper.length; letter++) {
            System.out.print((char) (letter + 'A'));
            System.out.print(": " + upper[letter]);
            System.out.print("\t\t" + (char) (letter + 'a'));
            System.out.println(": " + lower[letter]);
        }

        System.out.println();
        System.out.println("Non-alphabetic characters: " + other);

        scan.close();
    }
}

