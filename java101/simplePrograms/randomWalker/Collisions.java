package code.java101.simplePrograms.randomWalker;

/**
 * Collisions.
 *
 * @author BCIT
 * @version 2020
 */
public class Collisions {

    /**
     * Returns true if the two RandomWalkers occupy the same position.
     *
     * @param one a RandomWalker
     * @param two a RandomWalker
     * @return true if one and two occupy the same position
     */
    public static boolean samePosition(RandomWalker one, RandomWalker two) {
        return one.getXcoordinate() == two.getXcoordinate()
                && one.getYcoordinate() == two.getYcoordinate();

    }

    /**
     * Drives the program.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        final int boundary = 1_000_000; // neato!
        final int steps = 100_000;
        final int startingPositionX = 3;
        RandomWalker walkerOne = new RandomWalker(steps, boundary);
        walkerOne.setXcoordinate(startingPositionX);
        RandomWalker walkerTwo = new RandomWalker(steps, boundary);
        walkerTwo.setXcoordinate(-startingPositionX); // not as neat, still cool
        int collisions = 0;
        while (walkerOne.moreSteps() && walkerTwo.moreSteps()) {
            walkerOne.takeStep();
            walkerTwo.takeStep();
            if (samePosition(walkerOne, walkerTwo)) {
                collisions++;
                // Extra
                System.out.println("There was a collision at ("
                        + walkerOne.getXcoordinate() + ", "
                        + walkerTwo.getYcoordinate() + ")");

            }
        }
        System.out.println("There were " + collisions + " collisions");

    }

}
