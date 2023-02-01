package code.inheritance.introToInheritance.animalHierarchy;

/**
 * BirdFarm.
 *
 * @author BCIT
 * @version 2020
 */
public class BirdFarm {

    /**
     * Drives the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        Bird ostrich = new Ostrich(1, "black and white");
        Bird penguin = new Penguin(1, "black and white");
        Bird cormorant = new Cormorant(1, "black");
        ostrich.move();
        penguin.move();
        cormorant.move();

    }

}
