package code.inheritance.abstractClasses;

/**
 * Dog is an abstract class intended to be used
 * as a superclass.  It can also be used as the
 * data type for a variable.  We can then use
 * polymorphism and assign the reference of any
 * object that is a Dog or a subclass of Dog to
 * the variable.
 *
 * @author BCIT
 * @version 2020
 */
public abstract class Dog {

    /**
     * Stores the Dog's name as a String.
     */
    protected final String name;

    /**
     * Constructs an object of type Dog.
     *
     * @param name a String that cannot be null or only whitespace
     */
    public Dog(String name) {
        if (name != null && name.trim().length() > 0) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    /**
     * Returns the name for this Dog.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Speaks.
     *
     * @return woof!
     */
    public String speak() {
        return "WOOF!";
    }

    /**
     * Returns the average weight in KG for the breed.
     *
     * @return averageWeight a double
     */
    public abstract double averageBreedWeightKG();

    /**
     * Returns a String representation of this Dog.
     *
     * @return description
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "Dog [name=" + name + "]";
    }

    /**
     * Dogs are equal if their names are equal.
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
        Dog otherDog = (Dog) other;
        return name.equals(otherDog.getName());
    }

    /**
     * Returns a hashCode for this instance of the Dog class.
     *
     * @return hashCode as an int.
     */
    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
