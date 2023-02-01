package code.java101.enums;

/**
 * Demonstrates the use of a full enumerated type.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class SeasonTester {

    /**
     * Iterates through the values of the Season enumerated type.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        for (Season time : Season.values()) {
            System.out.println(time + "\t" + time.getSpan());
        }
    }
}

