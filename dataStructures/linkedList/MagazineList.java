package code.dataStructures.linkedList;

/**
 * Represents a collection of magazines.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class MagazineList {

    /**
     * The list of magazines.
     */
    private MagazineNode head;

    /**
     * Constructs a new MagazineList object that is empty.
     */
    public MagazineList() {
        head = null;
    }

    /**
     * Adds the specified Magazine to this MagazineList. Creates a new
     * MagazineNode object and adds it to the end of the linked list.
     *
     * @param mag The magazine to add.
     */
    public void add(final Magazine mag) {
        MagazineNode node = new MagazineNode(mag);
        MagazineNode current;

        if (head == null) {
            head = node;
        } else {
            current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    /**
     * Returns a String representation of this MagazineList.
     *
     * @return toString The list of magazines.
     */
    public String toString() {
        String result = "";

        MagazineNode current = head;

        while (current != null) {
            result += current.magazine + "\n";
            current = current.next;
        }

        return result;
    }

    /*
     * An inner class that represents a node in the magazine list. The public
     * variables are accessed by the MagazineList class
     *
     * @author Lewis & Loftus 9e
     * @author BCIT
     * @version 2020
     */
    private class MagazineNode {

        /*
         * The magazine stored in this node.
         */
        private Magazine magazine;

        /*
         * The next magazine in the list.
         */
        private MagazineNode next;

        /*
         * Constructs a new MagazineNode object that contains the specified
         * Magazine.
         *
         * @param mag The Magazine to store in this node.
         */
        MagazineNode(final Magazine mag) {
            magazine = mag;
            next = null;
        }
    }
}

