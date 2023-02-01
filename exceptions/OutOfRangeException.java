package code.exceptions;

/**
 * There's nothing here!
 *
 * @author BCIT
 * @version 2020
 */
public class OutOfRangeException extends Exception {

    /**
     * Constructs an object of type OutOfRangeException
     */
    public OutOfRangeException() { }

    /**
     * Constructs an object of type OutOfRangeException
     * @param message a description of the exceptional situation
     */
    public OutOfRangeException(String message) {
        super(message);
    }
}
