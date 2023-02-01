package code.inheritance.introToInheritance.roads;

/**
 * Road.
 * 
 * @author BCIT
 * @version 1.0
 */
public class Road {

    private String name;
    private Direction direction;

    /**
     * Constructor for objects of type Road.
     * 
     * @param roadName the name
     * @param roadDirection the direction
     */
    public Road(String roadName, Direction roadDirection) {
        this.name = roadName;
        this.direction = roadDirection;
    }

    /**
     * Returns the name.
     * 
     * @return name as a String.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the direction.
     * 
     * @return direction as a Direction enum.
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * Prints a String representation of this Road.
     * 
     * @return toString a String representation
     */
    @Override
    public String toString() {
        return "Road [name=" + name + ", direction=" + direction + "]";
    }
}
