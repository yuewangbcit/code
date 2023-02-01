package code.inheritance.introToInheritance.shapes;

/**
 * Shape.
 *
 * @author BCIT
 * @version 2020
 */
public abstract class Shape {

    private String shapeName;

    public Shape(String name) {
        this.shapeName = name;
    }

    /**
     * Returns the surface area of this Shape.
     *
     * @return surfaceArea as a double
     */
    public abstract double surfaceArea();

    /**
     * Returns a String representation of this Shape.
     *
     * @return description as a String
     */
    public String toString() {
        return "Shape";
    }

}
