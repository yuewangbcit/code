package code.innerClasses;

/**
 * Outer contains an inner.
 */
class Outer {

    /**
     * Inner belongs to Outer.
     */
    class Inner {
    }
}

/**
 * InnerChild is a subclass of Outer.Inner.
 *
 * @author BCIT
 * @version 2020
 */
public class InnerChild extends Outer.Inner {

    // InnerChild() {} // Won't compile

    /**
     * In order to instantiate the specialized version of the Outer.Inner class,
     * we must first instantiate an instance of the Outer class.
     *
     * We MUST have an enclosing instance. We cannot create a freestanding Yolk! All
     * Yolks must be inside Eggs!
     *
     * Try commenting out this constructor and using the zero-param version.
     * @param outer an Outer object
     */
    InnerChild(final Outer outer) {
        outer.super();
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        Outer outer = new Outer();
        InnerChild innerChild = new InnerChild(outer);
    }
}
