package code.inheritance.introToInheritance.books;

/**
 * Demonstrates the use of the super reference.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class Words2 {
    /**
     * Instantiates a derived class and invokes its inherited and local methods.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        final int numberPages = 1500;
        final int numberDefinitions = 52_500;
        Dictionary2 webster = new Dictionary2(numberPages, numberDefinitions);
        System.out.println("Number of pages: " + webster.getPages());
        System.out.println("Number of definitions: "
                + webster.getDefinitions());
        System.out.println("Definitions per page: " + webster.computeRatio());
    }
}

