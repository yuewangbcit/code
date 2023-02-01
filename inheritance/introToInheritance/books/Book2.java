package code.inheritance.introToInheritance.books;

/**
 * Represents a book. Used as the parent of a derived class to demonstrate
 * inheritance and the use of the super reference.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class Book2 {

    private int pages;
    public Book2(int numPages) {
        pages = numPages;
    }

    /**
     * Returns the number of pages in the Book.
     *
     * @return pages as an int
     */
    public int getPages() {
        return pages;
    }

    /**
     * Sets (mutates) the number of pages in the Book.
     *
     * @param numPages an int
     */
    public void setPages(int numPages) {
        pages = numPages;
    }
}

