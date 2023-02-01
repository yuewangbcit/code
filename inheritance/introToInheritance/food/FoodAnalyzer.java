package code.inheritance.introToInheritance.food;

/**
 * Demonstrates indirect access to inherited private members.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class FoodAnalyzer {

    /**
     * Instantiates a Pizza object and prints its calories per serving.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        final int calories = 275;
        Pizza special = new Pizza(calories);

        System.out.println("Calories per serving: "
                + special.caloriesPerServing());
    }
}

