package code.inheritance.orderOfInitialization;

class Art {
    public Art() {
        System.out.println("Art constructor");
    }
}

class Drawing2 extends Art {
    public Drawing2() {
        System.out.println("Drawing constructor");
    }
}

/**
 * Pay attention to the order of execution.  This is quite
 * linear, but it demonstrates the fundamental principle
 * that the calls to super go all the way up the hierarchy.
 *
 * @author BCIT
 * @version 2020
 */
public class Cartoon extends Drawing2 {
    public Cartoon() {
        System.out.println("Cartoon constructor");
    }

    /**
     * Drives the program.
     * @param args
     */
    public static void main(String[] args) {

        Cartoon x = new Cartoon();
    }
}
