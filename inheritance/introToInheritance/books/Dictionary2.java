package code.inheritance.introToInheritance.books;

/**
 * Represents a dictionary, which is a book. Used to demonstrate inheritance and
 * the use of the super reference.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class Dictionary2 extends Book2 {

    private int definitions;

    /**
     * Constructs a new Dictionary object with the specified number of pages and
     * definitions.
     *
     * @param numPages       an int
     * @param numDefinitions an int
     */
    public Dictionary2(int numPages, int numDefinitions) {
        super(numPages);
        definitions = numDefinitions;
    }

    /**
     * Returns the ratio of definitions to pages as a double.
     *
     * @return definitionRatio as a double
     */
    public double computeRatio() {
        return (double) definitions / getPages();
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

