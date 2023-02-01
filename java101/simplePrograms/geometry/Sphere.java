package code.java101.simplePrograms.geometry;

/**
 * Sphere.
 *
 * @author BCIT
 * @version 2020
 */
public class Sphere {

    private static final double SQUARED = 2.0;
    private static final double CUBED = 3.0;

    private static final double DIVISOR = 4.0 / 3.0;

    private double radius;
    private double xCoordinate;
    private double yCoordinate;
    private double zCoordinate;

    /**
     * Constructs an object of type Sphere.
     *
     * @param radius of the Sphere
     * @param x      the x Cartesian coordinate of the centre
     * @param y      the y Cartesian coordinate of the centre
     * @param z      the z Cartesian coordinate of the centre
     */
    public Sphere(double radius, double x, double y, double z) {
        this.radius = radius;
        this.xCoordinate = x;
        this.yCoordinate = y;
        this.zCoordinate = z;
    }

    /**
     * Returns the radius for this Sphere.
     *
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius for this Sphere.
     *
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Returns the xCoordinate for this Sphere.
     *
     * @return xCoordinate
     */
    public double getxCoordinate() {
        return xCoordinate;
    }

    /**
     * Sets the xCoordinate for this Sphere.
     *
     * @param xCoordinate the xCoordinate to set
     */
    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    /**
     * Returns the yCoordinate for this Sphere.
     *
     * @return yCoordinate
     */
    public double getyCoordinate() {
        return yCoordinate;
    }

    /**
     * Sets the yCoordinate for this Sphere.
     *
     * @param yCoordinate the yCoordinate to set
     */
    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    /**
     * Returns the zCoordinate for this Sphere.
     *
     * @return zCoordinate
     */
    public double getzCoordinate() {
        return zCoordinate;
    }

    /**
     * Sets the zCoordinate for this Sphere.
     *
     * @param zCoordinate the zCoordinate to set
     */
    public void setzCoordinate(double zCoordinate) {
        this.zCoordinate = zCoordinate;
    }

    /**
     * Returns the surface area of this Sphere.
     *
     * @return surfaceArea
     */
    public double getSurfaceArea() {
        final double four = 4.0;
        return four * Math.PI * Math.pow(radius, SQUARED);
    }

    /**
     * Returns the volume of this Sphere.
     *
     * @return volume
     */
    public double getVolume() {
        final double four = 4.0;
        final double three = 3.0;
        return (four / three) * Math.PI * Math.pow(radius, CUBED);
    }

    /**
     * Returns a String representation of this Sphere.
     *
     * @return toString
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "Sphere [radius=" + radius + ", xCoordinate=" + xCoordinate
                + ", yCoordinate=" + yCoordinate + ", zCoordinate="
                + zCoordinate + "]";
    }
}
