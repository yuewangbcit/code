package code.dataStructures.stack;

/**
 * EmptyListException is an unchecked exception (it extends
 * RuntimeException).
 *
 * @author BCIT
 * @version 2020
 */
public class EmptyListException extends RuntimeException {

    /**
     * Constructs and object of type EmptyListException.
     */
    public EmptyListException() {
        this("List");
    }

    /**
     * Constructs an object of type EmptyListException.
     * @param name of an empty object.
     */
    public EmptyListException(final String name) {
        super(name + " is empty");
    }
}
