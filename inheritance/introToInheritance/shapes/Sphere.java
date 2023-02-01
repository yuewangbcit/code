package code.inheritance.introToInheritance.shapes;

/**
 * Sphere.
 *
 * @author BCIT
 * @version 2020
 */
public class Sphere extends Shape {

    private double radius;

    /**
     * Constructs an object of type Sphere.
     *
     * @param radius a positive double
     */
    public Sphere(double radius) {
        super("Sphere");
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Positive radii only!");
        }
    }

    /**
     * Returns the surface area of this Shape.
     *
     * @return surfaceArea as a double
     */
    @Override
    public double surfaceArea() {
        final int four = 4;
        return four * Math.PI * Math.pow(radius, 2);
    }

    /**
     * Returns a String representation of this Shape.
     *
     * @return description as a String
     */
    public String toString() {
        return "Sphere: radius " + radius;
    }
}
