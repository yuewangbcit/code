package code.inheritance.orderOfInitialization;

class Insect2 {
    protected int i = 9;
    protected int j;

    public Insect2() {
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
 * The Beetle2 class teaches us about initialization:
 * 1. Statics (super, then sub)
 * 2. Super instance variables and then constructor
 * 3. Subclass instance variables and then constructor
 *
 * @author BCIT
 * @version 2020
 */
public class Beetle2 {
    private int k = prt2("Beetle.k initialized");

    public Beetle2() {
        prt2("k = " + k);
        // prt("j = " + j);
    }

    private static int x2 = prt2("static Beetle.x2 initialized");

    private static int prt2(String s) {
        System.out.println(s);
        return 42;
    }

    /**
     * Drives the program.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Started program");
        Beetle2 b = new Beetle2();
        Insect2 i = new Insect2();
    }
}
