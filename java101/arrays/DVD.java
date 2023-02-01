package code.java101.arrays;

import java.text.NumberFormat;

/**
 * Represents a DVD.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class DVD {

    private final String title;
    private final String director;
    private final int year;
    private final double cost;
    private final boolean bluRay;

    /**
     * Constructs a new DVD with the specified information.
     *
     * @param title    a String
     * @param director a String
     * @param year     released
     * @param cost     to purchase
     * @param bluRay   or not bluRay
     */
    public DVD(String title,
               String director,
               int year,
               double cost,
               boolean bluRay) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = cost;
        this.bluRay = bluRay;
    }

    /**
     * Returns a description of this DVD as a String.
     *
     * @return toString description
     */
    public String toString() {
        final NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String description;
        description = fmt.format(cost) + "\t" + year + "\t";
        description += title + "\t" + director;
        if (bluRay) {
            description += "\t" + "Blu-Ray";
        }
        return description;
    }
}

