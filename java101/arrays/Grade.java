package code.java101.arrays;

/**
 * Represents a school grade.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class Grade {

    private final String name;
    private int lowerBound;

    /**
     * Constructs a Grade object with the specified grade name and numeric lower
     * bound.
     *
     * @param grade  a String
     * @param cutoff an int
     */
    public Grade(String grade, int cutoff) {
        name = grade;
        lowerBound = cutoff;
    }

    /**
     * Gets (accesses) the Grade name.
     *
     * @return name as a String
     */
    public String getName() {
        return name;
    }

    /**
     * Gets (accesses) the Grade lower bound.
     *
     * @return lowerBound as an int
     */
    public int getLowerBound() {
        return lowerBound;
    }

    /**
     * Sets (mutates) the lower bound to be the specified value.
     *
     * @param cutoff an int
     */
    public void setLowerBound(int cutoff) {
        lowerBound = cutoff;
    }

    /**
     * Returns a description of this Grade as a String.
     *
     * @return toString description
     */
    public String toString() {
        return name + "\t" + lowerBound;
    }
}

