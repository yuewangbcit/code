package code.inheritance.introToInheritance.books;

/**
 * Demonstrates the use of an inherited method.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class Words {

    /**
     * Instantiates a derived class and invokes its inherited and local methods.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        Dictionary webster = new Dictionary();
        System.out.println("Number of pages: " + webster.getPages());
        System.out.println("Number of definitions: "
                + webster.getDefinitions());
        System.out.println("Definitions per page: " + webster.computeRatio());
    }
}

