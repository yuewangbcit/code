package code.inheritance.orderOfInitialization;


class Cup {
    public Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    protected void f(int marker) {
        System.out.println("Cup.f(" + marker + ")");
    }
}

class Cups {
    protected static Cup c1;
    protected static Cup c2;

    static {
        System.out.println("entered Cups static block");
        c1 = new Cup(1);
        c2 = new Cup(2);
        System.out.println("exited Cups static block");

    }

    public Cups() {
        System.out.println("Cups()");
    }
}

/**
 * What's happening here?
 *
 * @author BCIT
 * @version 2020
 */
public class ExplicitStatic {

    /**
     * Drives the program.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Inside main()");
        new Cups();
        Cups.c1.f(99);
    }

    static Cups x = new Cups();
    static Cups y = new Cups();
}
