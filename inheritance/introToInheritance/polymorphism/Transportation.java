package code.inheritance.introToInheritance.polymorphism;

/**
 * Cars drive.
 */
interface Car {
    /**
     * Drive.
     */
    void drive();
}

/**
 * Boats sail.
 */
interface Boat {
    /**
     * Sail.
     */
    void sail();
}

/**
 * A vehicle that turns.
 */
class Vehicle {
    /**
     * Turn.
     */
    public void turn() {
        System.out.println("Turning vehicle");
    }
}

/**
 * Hovercraft.
 */
class Hovercraft extends Vehicle implements Car, Boat {
    /**
     * Drive
     */
    @Override
    public void drive() {
        System.out.println("drive on ground");
    }

    /**
     * Sail.
     */
    @Override
    public void sail() {
        System.out.println("sail on water");
    }
}

/**
 * Porsche.
 */
class Porche extends Vehicle implements Car {

    /**
     * Drive.
     */
    public void drive() {
        System.out.println("drive very fast - ZOOOM!");
    }
}

/**
 * Demonstrates polymorphism.
 *
 * @author BCIT
 * @version 2020
 */
public class Transportation {
    /**
     * Test drive the specified Car.
     * @param c a Car
     */
    public void testDrive(Car c) {
        c.drive();
    }

    /**
     * Sail the specified Boat.
     * @param b a Boat
     */
    public void testSail(Boat b) {
        b.sail();
    }

    /**
     * Turn the specified Vehicle.
     * @param v a vehicle to turn
     */
    public void testTurn(Vehicle v) {
        v.turn();
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Transportation t = new Transportation();
        Porche p = new Porche();
        Hovercraft h = new Hovercraft();
        t.testDrive(p);
        t.testDrive(h);
        t.testSail(h);
        t.testTurn(p);
        t.testTurn(h);
    }
}