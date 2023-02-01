package code.inheritance.abstractClasses;

/**
 * DogTest.
 *
 * @author BCIT
 * @version 2020
 */
public class DogTest {

    /**
     * Drives the program.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        //Dog dog = new Dog("Spike");
        //System.out.println(dog.getName() + " says " + dog.speak());

        Labrador lab = new Labrador("Hannah", "Golden");
        System.out.println(lab.getName() + " says " + lab.speak());
        System.out.println(lab.getName() + " weighs " + lab.averageBreedWeightKG());

        Yorkshire yorkie = new Yorkshire("Sebastian", true);
        System.out.println(yorkie.getName() + " says " + yorkie.speak());
        System.out.println(yorkie.getName() + " weighs " + yorkie.averageBreedWeightKG());


    }

}
