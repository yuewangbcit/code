package code.inheritance.introToInheritance.shapes;

/**
 * PaintCan.
 *
 * @author BCIT
 * @version 2020
 */
public class PaintCan {

    private double coverage;

    /**
     * Constructs an object of type Paint.
     *
     * @param coverage a double
     */
    public PaintCan(double coverage) {
        this.coverage = coverage;
    }

    /**
     * Returns the number of Cans needed to
     * paint the specified Shape.
     *
     * @param shape to paint
     * @return cans of paint needed
     */
    public double amount(Shape shape) {
        System.out.println("Computing amount for " + shape);
        return shape.surfaceArea() / coverage;
    }

}
