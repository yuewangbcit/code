package code.java101.helloworld;

/**
 * HelloWorld.
 *
 * @author BCIT
 * @version 2022
 */
public final class HelloWorld {

    private HelloWorld() {

    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {

        final String message = "Hello world!";
        System.out.println(message);

        String emptyString = "";

        String anotherString = new String("George wuz here");

        Integer thisIsAWrapper = new Integer(2);

        String noString = null;

        final int number = 5;

        final int anotherNumber = 5;

        double value = 0;
        System.out.println(value);

        final int classSize = 41;

        for (int i = 0; i < classSize; i++) {
            System.out.println("Welcome");
        }

    }
} // end of the class
