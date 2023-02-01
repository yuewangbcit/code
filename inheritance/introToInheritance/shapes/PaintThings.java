package code.inheritance.introToInheritance.shapes;

import java.text.DecimalFormat;

/**
 * PaintThings.
 *
 * @author BCIT
 * @version 2020
 */
public class PaintThings {

    /**
     * Drives the program.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        final double coverage = 250;
        PaintCan paint = new PaintCan(coverage);
        Cube deck = new Cube(20);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);

        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of cans of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }

}
