package code.inheritance.introToInheritance.shapes;

/**
 * Cylinder.
 *
 * @author BCIT
 * @version 2020
 */
public class Cylinder extends Shape {

    private double radius;
    private double height;

    /**
     * Constructs an object of type Cylinder.
     *
     * @param radius a positive double
     * @param height a positive double
     */
    public Cylinder(double radius, double height) {
        super("Cylinder");
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Positive radius only!");
        }
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Positive height only!");
        }
    }

    /**
     * Returns the surface area of this Shape.
     *
     * @return surfaceArea as a double
     */
    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    /**
     * Returns a String representation of this Shape.
     *
     * @return description as a String
     */
    public String toString() {
        return "Cylinder: radius " + radius + " height: " + height;
    }

}
