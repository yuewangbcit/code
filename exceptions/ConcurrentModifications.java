package code.exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates a ConcurrentModificationException.
 *
 * @author BCIT
 * @version 2020
 */
public class ConcurrentModifications {

    /**
     * Drives the program.
     *
     * @param args
     */
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(); // What type is integers?!
        integers.add(0);
        integers.add(1);
        integers.add(2);

        for (Integer integer : integers) {
            integers.remove(0); // 🛑 NO!
        }

    }

}
