package code.exceptions;

/**
 * A very important Exception.  A Checked Exception.
 */
class VeryImportantException extends Exception {

    /**
     * Returns a String representation of this VeryImportantException.
     * @return representation as a String
     */
    public String toString() {
        return "A very important exception!";
    }
}

/**
 * A trivial Exception.  A Checked Exception.
 */
class TrivialException extends Exception {

    /**
     * Returns a String representation of this TrivialException.
     * @return representation as a String
     */
    public String toString() {
        return "A trivial exception";
    }
}

/**
 * Demonstrates a lost exception.
 *
 * @author BCIT
 * @version 2020
 */
public class LostMessage {

    /**
     * This function does very little.
     * @throws VeryImportantException all the time
     */
    public void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    /**
     * This function also does very little.
     * @throws TrivialException all the time
     */
    void dispose() throws TrivialException {
        throw new TrivialException();
    }

    /**
     * Drives the program.
     * @param args
     * @throws Exception (which will crash the program)
     */
    public static void main(String[] args) throws Exception {
        LostMessage lostMessage = new LostMessage();
        try {
            lostMessage.f();
        } finally {
            lostMessage.dispose();
        }
    }
}