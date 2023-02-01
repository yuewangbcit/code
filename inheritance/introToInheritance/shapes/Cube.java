package code.inheritance.introToInheritance.shapes;

/**
 * Cube.
 *
 * @author BCIT
 * @version 2020
 */
public class Cube extends Shape {

    private double sideLength;

    /**
     * Constructs an object of type Cube.
     *
     * @param sideLength a double
     */
    public Cube(double sideLength) {
        super("Cube");
        if (sideLength > 0) {
            this.sideLength = sideLength;
        } else {
            throw new IllegalArgumentException("Positive sideLength only!");
        }
    }

    /**
     * Returns the surface area of this Shape.
     *
     * @return surfaceArea as a double
     */
    @Override
    public double surfaceArea() {
        final int sides = 6;
        return sideLength * sideLength * sides;
    }

    /**
     * Returns a String representation of this Shape.
     *
     * @return description as a String
     */
    public String toString() {
        return "Cube: side length " + sideLength;
    }
}
