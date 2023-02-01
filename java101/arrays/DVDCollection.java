package code.java101.arrays;

import java.text.NumberFormat;

/**
 * Represents a collection of DVDs.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class DVDCollection {

    /**
     * Default collection size.
     */
    public static final int DEFAULT_SIZE = 100;

    private DVD[] collection;
    private int count;
    private double totalCost;

    /**
     * Constructs a new empty DVDCollection of default size.
     */
    public DVDCollection() {
        collection = new DVD[DEFAULT_SIZE];
        count = 0;
        totalCost = 0.0;
    }

    /**
     * Adds a new DVD to this DVDCollection. Creates a new DVD using the
     * specified information and adds it.  Increases the size of the
     * collection array if necessary.
     *
     * @param title    a String
     * @param director a String
     * @param year     an int
     * @param cost     a double
     * @param bluRay   a boolean
     */
    public void addDVD(String title,
                       String director,
                       int year,
                       double cost,
                       boolean bluRay) {
        if (count == collection.length) {
            increaseSize();
        }
        collection[count] = new DVD(title, director, year, cost, bluRay);
        totalCost += cost;
        count++;
    }

    /**
     * Adds the specified DVD to this collection.
     *
     * @param dvd the DVD to add
     */
    public void addDVD(DVD dvd) {
        if (count == collection.length) {
            increaseSize();
        }
        collection[count] = dvd;
        count++;
    }

    /**
     * Returns a description of this DVDCollection as a String.
     *
     * @return toString description
     */
    public String toString() {
        final NumberFormat fmt = NumberFormat.getCurrencyInstance();

        String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        report += "My DVD Collection\n\n";

        report += "Number of DVDs: " + count + "\n";
        report += "Total cost: " + fmt.format(totalCost) + "\n";
        report += "Average cost: " + fmt.format(totalCost / count);

        report += "\n\nDVD List:\n\n";

        for (int dvd = 0; dvd < count; dvd++) {
            report += collection[dvd].toString() + "\n";
        }
        return report;
    }

    /*
     * Increases the capacity of the collection by creating a
     * larger array and copying the existing collection into it.
     */
    private void increaseSize() {
        final DVD[] temp = new DVD[collection.length * 2];

        for (int dvd = 0; dvd < collection.length; dvd++) {
            temp[dvd] = collection[dvd];
        }

        collection = temp;
    }
}

