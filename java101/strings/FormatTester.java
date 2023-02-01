package code.java101.strings;

/**
 * Demonstrates the use of the String class' static format method.
 *
 * @author BCIT
 * @version 2020
 */
public class FormatTester {

    /**
     * Drives the program.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        final String t = String.format("The correct answer is %b", false);
        System.out.println(t);

        final String w = "Insert Name Here";
        final String s = String.format("The correct answer is %s", w);
        System.out.println(s);

    }
}
