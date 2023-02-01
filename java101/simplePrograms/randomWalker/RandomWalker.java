package code.java101.simplePrograms.randomWalker;

import java.util.Random;

/**
 * RandomWalker.
 *
 * @author BCIT
 * @version 2020
 */
public class RandomWalker {

    private int xCoordinate;
    private int yCoordinate;
    private int maximumStepsToTake;
    private int currentStepsTaken;
    private int boundary;
    private int maximumDistanceFromOrigin;
    private Random random;

    /**
     * Constructs an object of type RandomWalker.
     *
     * @param maximumStepsToTake an int
     * @param boundary           an int
     */
    public RandomWalker(int maximumStepsToTake, int boundary) {
        xCoordinate = 0;
        yCoordinate = 0;
        this.maximumStepsToTake = maximumStepsToTake;
        currentStepsTaken = 0;
        this.boundary = boundary;
        maximumDistanceFromOrigin = 0;
        random = new Random();
    }

    /**
     * Constructs an object of type RandomWalker.
     *
     * @param xCoordinate        an int
     * @param yCoordinate        an int
     * @param maximumStepsToTake an int
     * @param boundary           an int
     */
    public RandomWalker(int xCoordinate,
                        int yCoordinate,
                        int maximumStepsToTake,
                        int boundary) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.maximumStepsToTake = maximumStepsToTake;
        currentStepsTaken = 0;
        this.boundary = boundary;
        maximumDistanceFromOrigin = 0;
        random = new Random();
    }

    /**
     * Returns the AnotherExceptionQuestion Coordinate.
     *
     * @return xCoordinate
     */
    public int getXcoordinate() {
        return xCoordinate;
    }

    /**
     * Sets the AnotherExceptionQuestion Coordinate.
     *
     * @param newX an int
     */
    public void setXcoordinate(int newX) {
        xCoordinate = newX;
    }

    /**
     * Returns the Y Coordinate.
     *
     * @return yCoordinate
     */
    public int getYcoordinate() {
        return yCoordinate;
    }

    /**
     * Sets the Y Coordinate.
     *
     * @param newY an int
     */
    public void setYcoordinate(int newY) {
        yCoordinate = newY;
    }

    /**
     * Takes a step.
     */
    public void takeStep() {
        final int north = 0;
        final int south = 1;
        final int east = 2;
        final int west = 3;
        final int directions = 4;
        currentStepsTaken++;
        int direction = random.nextInt(directions);
        switch (direction) {
            case north:
                yCoordinate++;
                maximumDistanceFromOrigin =
                        max(maximumDistanceFromOrigin, Math.abs(yCoordinate));
                break;
            case south:
                yCoordinate--;
                maximumDistanceFromOrigin =
                        max(maximumDistanceFromOrigin, Math.abs(yCoordinate));
                break;
            case east:
                xCoordinate++;
                maximumDistanceFromOrigin =
                        max(maximumDistanceFromOrigin, Math.abs(xCoordinate));
                break;
            case west:
                xCoordinate--;
                maximumDistanceFromOrigin =
                        max(maximumDistanceFromOrigin, Math.abs(xCoordinate));
                break;
            default:
                break;
        }

        // Alternative (less code duplication, use nested calls to max)
        maximumDistanceFromOrigin = max(
                maximumDistanceFromOrigin, max(
                        Math.abs(xCoordinate),
                        Math.abs(yCoordinate)));

    }

    /**
     * Returns the max of the two specified values.
     *
     * @param a an int
     * @param b an int
     * @return the max of a and be
     */
    private int max(int a, int b) {
        return a > b ? a : b;
    }

    /**
     * Returns the maximum distance from the origin this RandomWalker has
     * traveled.
     *
     * @return distance as an int
     */
    public int getMaximumDistance() {
        return maximumDistanceFromOrigin;
    }

    /**
     * Returns true if this RandomWalker has more steps to take.
     *
     * @return true if there are more steps to take, else false
     */
    public boolean moreSteps() {
        return maximumStepsToTake > currentStepsTaken;
    }

    /**
     * Returns true if the RandomWalker is in bounds, else false.
     *
     * @return true if in bounds, else false
     */
    public boolean inBounds() {
        return Math.abs(xCoordinate) <= boundary
                && Math.abs(yCoordinate) <= boundary;
    }

    /**
     * Walks while there are more steps and the RandomWalker is in bounds.
     */
    public void walk() {
        while (moreSteps() && inBounds()) {
            takeStep();
        }
    }

    /**
     * Returns a String containing this RandomWalker's coordinates and current
     * step.
     *
     * @return description as a String
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "RandomWalker [xCoordinate=" + xCoordinate + ","
                + "yCoordinate=" + yCoordinate + ", currentStepsTaken="
                + currentStepsTaken + "]";
    }

}
