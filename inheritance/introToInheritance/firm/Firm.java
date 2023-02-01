package code.inheritance.introToInheritance.firm;

/**
 * Demonstrates code.polymorphism via inheritance.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class Firm {
    /**
     * Creates a staff of employees for a firm and pays them.
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        Staff personnel = new Staff();

        personnel.payday();
    }
}

