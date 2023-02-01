package code.inheritance.introToInheritance.books;

/**
 * Represents a book. Used as the parent of a derived class to demonstrate
 * inheritance.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class Book {

    private static final int DEFAULT_PAGES = 1500;

    /**
     * An average book has this many pages.
     */
    protected int pages = DEFAULT_PAGES;

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

