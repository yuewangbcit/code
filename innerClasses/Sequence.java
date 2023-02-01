package code.innerClasses;

/**
 * Selector permits us to visit elements in a Sequence.
 */
interface Selector {
    boolean end();
    Object current();
    void next();
}

/**
 * Sequence stores an ordered collection of elements.
 *
 * @author BCIT
 * @version 2020
 */
public class Sequence {

    private Object[] items;
    private int next = 0;

    /**
     * Creates an object of type Sequence.
     * @param size the proposed size of the Sequence (an int)
     */
    public Sequence(final int size) {
        items = new Object[size];
    }

    /**
     * Adds the specified object to this Sequence.
     * @param newElement
     */
    public void add(final Object newElement) {
        if (next < items.length) {
            items[next++] = newElement;
        }
    }

    /* This private inner class implements the Selector interface. So cool! */
    private class SequenceSelector implements Selector {
        private int i = 0;

        /**
         * Returns true if this SequenceSelector is at the end of the Sequence.
         * @return true if we have visited all the elements in the Sequence, else false
         */
        public boolean end() {
            return i == items.length;
        }

        /**
         * Returns a reference to the element in the Sequence currently pointed at.
         * @return element currently being visited by this SequenceSelector
         */
        public Object current() {
            return items[i];
        }

        /**
         * Increments the pointer.
         */
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }

    /**
     * Returns  new SequenceSelector for iterating over this Sequence.
     * @return selector a SequenceSelector
     */
    public Selector selector() {
        return new SequenceSelector();
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        final int size = 10;
        Sequence sequence = new Sequence(size);
        for (int i = 0; i < size; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector(); // Note the datatype of the variable. Why?
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
