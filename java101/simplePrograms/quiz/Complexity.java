package code.java101.simplePrograms.quiz;

/**
 * Represents the interface for an object that can be assigned an explicit
 * complexity.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public interface Complexity {
    /**
     * Returns the complexity.
     *
     * @return complexity as an int
     */
    int getComplexity();

    /**
     * Sets the complexity.
     *
     * @param complexity an int
     */
    void setComplexity(int complexity);
}

