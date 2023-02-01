package code.inheritance.abstractClasses;

/**
 * Yorkshire, a specialized version of Dog.
 *
 * @author BCIT
 * @version 2020
 */
public class Yorkshire extends Dog {

    private static final int YORKSHIRE_WEIGHT = 4;
    private boolean ratter;

    /**
     * Constructs an object of type Yorkshire.
     *
     * @param name   cannot be blank or all whitespace
     * @param ratter true if trained to catch rats
     */
    public Yorkshire(String name, boolean ratter) {
        super(name);
        this.ratter = ratter;
    }

    /**
     * Returns true if this Yorkshire is a ratter, else false.
     *
     * @return color as a String
     */
    public boolean isRatter() {
        return ratter;
    }

    /**
     * Speaks.
     *
     * @return woof!
     */
    @Override
    public String speak() {
        return "YAPYAPYAP!";
    }

    /**
     * Returns the average weight in KG for the breed.
     *
     * @return averageWeight a double
     */
    @Override
    public double averageBreedWeightKG() {
        return YORKSHIRE_WEIGHT;
    }

    /**
     * Returns a String representation of this Yorkshire.
     *
     * @return description
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "Yorkshire [ratter=" + ratter + ", name=" + name + "]";
    }

    /**
     * Yorkshires are equal if their names and ratter-training are equal.
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
        Yorkshire otherTorkie = (Yorkshire) other;
        return name.equals(otherTorkie.getName())
                && ratter == otherTorkie.isRatter();
    }

}
