package code.inheritance.orderOfInitialization;

/**
 * Insect.
 *
 * @author BCIT
 * @version 2020
 */
class Insect {
    protected int i = 9;
    protected int j;

    public Insect() {
        prt("i = " + i + ", j = " + j);
        j = 39;
    }

    protected static int x1 = prt("static Insect.x1 initialized");

    protected static int prt(String s) {
        System.out.println(s);
        return 47;
    }
}

/**
 * The Beetle class teaches us about initialization:
 * 1. Statics (super, then sub)
 * 2. Super instance variables and then constructor
 * 3. Subclass instance variables and then constructor
 *
 * @author BCIT
 * @version 2020
 */
public class Beetle extends Insect {
    private int k = prt("Beetle.k initialized");

    public Beetle() {
        prt("k = " + k);
        prt("j = " + j);
    }

    private static int x2 = prt("static Beetle.x2 initialized");

    /**
     * Drives the program.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Started program");
        Beetle b = new Beetle();
        Insect i = new Insect();
    }

}
