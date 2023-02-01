package code.dataStructures.linkedList;

/**
 * Represents a single magazine.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class Magazine {

    /**
     * The title of the magazine.
     */
    private String title;

    /**
     * Constructs a new Magazine object with the specified title.
     *
     * @param newTitle The title of the magazine
     */
    public Magazine(String newTitle) {
        title = newTitle;
    }

    /**
     * Returns a String representation of this Magazine.
     *
     * @return toString This magazine's title.
     */
    public String toString() {
        return title;
    }
}

