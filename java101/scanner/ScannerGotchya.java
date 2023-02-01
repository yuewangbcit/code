package code.java101.scanner;

import java.util.Scanner;

/**
 * Demonstrates the Scanner "gotchya"!
 *
 * @author BCIT
 * @version 2020
 */
public class ScannerGotchya {

    /**
     * Drives the program.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {

        final Scanner scan = new Scanner(System.in);
        String userInput = "yes";

        while (userInput.equalsIgnoreCase("yes")) {
            System.out.println("What's the most interesting thing you learned today?");
            String factoid = scan.nextLine();
            System.out.println("What percentage of your waking time do you spend studying?");
            double studyRatio = scan.nextDouble();
            System.out.println("How many candy bars can you eat in a single sitting?");
            int chocoholic = scan.nextInt();
            scan.nextLine(); // What happens if we omit this line of code?!
            System.out.print("Play again? (Enter yes): ");
            userInput = scan.nextLine();
        }
        scan.close();
    }
}
