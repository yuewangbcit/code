package code.inheritance.abstractClasses;

/**
 * Labrador, a specialized version of Dog.
 *
 * @author BCIT
 * @version 2020
 */
public class Labrador extends Dog {

    private static final int LABRADOR_WEIGHT = 35;
    private String color;

    /**
     * Constructs an object of type Labrador.
     *
     * @param name  cannot be blank or all whitespace
     * @param color cannot be blank or all whitespace
     */
    public Labrador(String name, String color) {
        super(name);
        if (color != null && color.trim().length() > 0) {
            this.color = color;
        } else {
            throw new IllegalArgumentException("Color cannot be blank");
        }
    }

    /**
     * Returns the color.
     *
     * @return color as a String
     */
    public String getColor() {
        return color;
    }

    /**
     * Speaks.
     *
     * @return woof!
     */
    @Override
    public String speak() {
        return "BOW WOW!";
    }

    /**
     * Returns the average weight in KG for the breed.
     *
     * @return averageWeight a double
     */
    @Override
    public double averageBreedWeightKG() {
        return LABRADOR_WEIGHT;
    }

    /**
     * Returns a String representation of this Labrador.
     *
     * @return description
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "Labrador [color=" + color + ", name=" + name + "]";
    }

    /**
     * Labradors are equal if their names and colors are equal.
     *
     * @param other Object
     * @return true if the same else false
     */
    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (!this.getClass().equals(other.getClass())) {
            return false;
        }
        Labrador otherLab = (Labrador) other;
        return name.equals(otherLab.getName())
                && color.equals(otherLab.getColor());
    }

}
