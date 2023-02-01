package code.inheritance.introToInheritance.firm;

/**
 * Salesperson.
 *
 * @author BCIT
 * @version 2-2-
 */
public class Salesperson implements Comparable<Salesperson> {

    private String firstName;
    private String lastName;
    private int totalSales;

    /**
     * Constructs an object of type Salesperson.
     *
     * @param first name
     * @param last  name
     * @param sales made last week (an int)
     */
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    /**
     * Returns a String representation of this Salesperson.
     *
     * @return description as a String
     */
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    /**
     * Compares this Salesperson to the Salesperson passed as a parameter. The
     * salesperson who sells more comes usefulclasses.
     *
     * @param other Salesperson
     * @return
     * @see Comparable#compareTo(Object)
     */
    @Override
    public int compareTo(Salesperson other) {
        return getSales() - other.getSales();
    }

    /**
     * Returns the Salesperson's usefulclasses name.
     *
     * @return firstname as a String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the Salesperson's last name.
     *
     * @return lastName as a String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the Salesperson's total sales rounded to the dollar.
     *
     * @return sales as an int
     */
    public int getSales() {
        return totalSales;
    }

}
