package code.inheritance.introToInheritance.books;

/**
 * Represents a dictionary, which is a book. Used to demonstrate inheritance.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class Dictionary extends Book {

    private static final int DEFAULT_DEFINITIONS = 52500;
    private int definitions = DEFAULT_DEFINITIONS;

    /**
     * Returns the ratio of definitions to pages as a double.
     *
     * @return definitionRatio as a double
     */
    public double computeRatio() {
        return (double) definitions / pages;
    }

    /**
     * Returns (gets) the number of definitions.
     *
     * @return definitions as an int
     */
    public int getDefinitions() {
        return definitions;
    }

    /**
     * Sets (mutates) the number of definitions.
     *
     * @param numDefinitions an int
     */
    public void setDefinitions(int numDefinitions) {
        definitions = numDefinitions;
    }

}

