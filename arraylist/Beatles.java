package code.arraylist;

import java.util.ArrayList;

/**
 * Demonstrates the use of a ArrayList object.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public final class Beatles {

    private Beatles() {

    }

    /**
     * Stores and modifies a list of band members.
     *
     * @param args command line arguments (unused)
     */
    public static void main(final String[] args) {
        final ArrayList<String> band = new ArrayList<>();

        band.add("Paul");
        band.add("Pete");
        band.add("John");
        band.add("George");

        System.out.println(band);
        band.remove("Pete");

        System.out.println(band);
        System.out.println("At index 1: " + band.get(1));
        band.add(2, "Ringo");

        System.out.println("Size of the band: " + band.size());
        int index = 0;
        while (index < band.size()) {
            System.out.println(band.get(index));
            index++;
        }
    }
}

