package code.exceptions;

/**
 * This is NOT how we want to deal with Exceptions. This approach
 * is not Java style (LBYL).  This is Pythonic (EAFP).
 *
 * @author BCIT
 * @version 2020
 */
public class DontDoThis {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        String hello = "Blue";

        // This makes Java developers' eyes bleed
        try {
            int index = 0;
            while (true) {
                System.out.println(hello.charAt(index));
                index++;
            }
        } catch(Exception e) { }
    }
}
