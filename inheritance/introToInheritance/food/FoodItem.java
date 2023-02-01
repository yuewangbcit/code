package code.inheritance.introToInheritance.food;

/**
 * Represents an item of food. Used as the parent of a derived class to
 * demonstrate indirect referencing.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class FoodItem {
    /**
     * Number of calories per gram of fat.
     */
    public static final int CALORIES_PER_GRAM = 9;

    protected int servings;
    private int fatGrams;

    /**
     * Constructs a FoodItem with the specified number of fat grams and number
     * of servings.
     *
     * @param numFatGrams an int
     * @param numServings an int
     */
    public FoodItem(int numFatGrams, int numServings) {
        fatGrams = numFatGrams;
        servings = numServings;
    }

    /*
     * Calculates and returns the number of calories in this FoodItem due to
     * fat.
     */
    private int calories() {
        return fatGrams * CALORIES_PER_GRAM;
    }

    /**
     * Calculates and returns the number of calories per serving in this
     * FoodItem.
     *
     * @return caloriesPerServing as an int
     */
    public int caloriesPerServing() {
        return (calories() / servings);
    }
}

