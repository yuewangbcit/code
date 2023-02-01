package code.java101.books;

/**
 * Tests the Book class.
 *
 * @author BCIT
 * @version 2020
 */
public class Driver {

    /**
     * Drives the program.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        final Book myBook = new Book();
        System.out.println(myBook);

        final Book anotherBook = new Book("Ann Rice", "Identity Modernity and War", 350);
        System.out.println(anotherBook);

    }
}
