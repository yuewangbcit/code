package code.inheritance.introToInheritance.roads;

/**
 * Boulevard is a road that incorporates a greenspace median.
 * 
 * @author BCIT
 * @version 2020
 */
public class Boulevard extends Road {

    private final boolean medianHasTrees;

    /**
     * Constructor for objects of type Boulevard.
     * 
     * @param roadName the name
     * @param roadDirection the direction
     * @param medianHasTrees true if the median has trees, else false
     */
    public Boulevard(String roadName, Direction roadDirection, boolean medianHasTrees) {
        super(roadName, roadDirection);
        this.medianHasTrees = medianHasTrees;
    }

    /**
     * Prints a String representation of this Boulevard.
     * 
     * @return toString a String representation
     */
    @Override
    public String toString() {
        return "Boulevard [name=" + getName() + ", direction=" + getDirection()
                + ", medianHasTrees=" + medianHasTrees + "]";
    }
}
