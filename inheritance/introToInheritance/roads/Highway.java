package code.inheritance.introToInheritance.roads;

/**
 * Motorway is a fast roat that may have an HOV lane.
 * 
 * @author BCIT
 * @version 2020
 */
public class Highway extends Road {

    private boolean hasHOVlane;

    /**
     * Constructor for objects of type Motorway.
     * 
     * @param roadName the name
     * @param roadDirection the direction
     * @param hasHOVlane true if the motorway includes an HOV lane
     */
    public Highway(String roadName, Direction roadDirection, boolean hasHOVlane) {
        super(roadName, roadDirection);
        this.hasHOVlane = hasHOVlane;
    }

    /**
     * Prints a String representation of this Motorway.
     *
     * @return toString a String representation
     */
    @Override
    public String toString() {
        return "Motorway [name=" + super.getName() + ", direction=" + super.getDirection() + ", hasHOVlane="
                + hasHOVlane + "]";
    }
}
