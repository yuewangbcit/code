package code.exceptions;

import java.util.Scanner;

/**
 * Demonstrates the use of a try-catch block.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class ProductCodes {

    /**
     * District numbers greater than this are disallowed.
     */
    public static final int MAX_DISTRICT = 2000;

    /**
     * The zone is at this index of the product code.
     */
    public static final int ZONE_INDEX = 9;

    /**
     * The district begins at this index of the the product code.
     */
    public static final int DISTRICT_BEG = 3;

    /**
     * The district ends at this index of the the product code.
     */
    public static final int DISTRICT_END = 7;

    /**
     * Counts the number of product codes that are entered with a
     * zone of R and and district greater than MAX_DISTRICT.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        String code;
        char zone;
        int district;
        int valid = 0;
        int banned = 0;

        final Scanner scan = new Scanner(System.in);

        System.out.print("Enter product code (XXX to quit): ");
        code = scan.nextLine();

        while (!code.equals("XXX")) {
            try {
                zone = code.charAt(ZONE_INDEX);
                district = Integer.parseInt(
                        code.substring(DISTRICT_BEG, DISTRICT_END));
                valid++;
                if (zone == 'R' && district > MAX_DISTRICT) {
                    banned++;
                }
            } catch (StringIndexOutOfBoundsException exception) {
                System.out.println("Improper code length: " + code);
            } catch (NumberFormatException exception) {
                System.out.println("District is not numeric: " + code);
            }

            System.out.print("Enter product code (XXX to quit): ");
            code = scan.nextLine();
        }
        scan.close();
        System.out.println("# of valid codes entered: " + valid);
        System.out.println("# of banned codes entered: " + banned);
    }
}

