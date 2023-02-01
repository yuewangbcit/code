package code.inheritance.introToInheritance.polymorphism;

/**
 * Polymorphism demo.
 *
 * @author BCIT
 * @version 2020
 */
public class Polymorphism3 {
    /**
     * Drives the program.
     * @param argv
     */
    public static void main(final String[] argv) {
        final F f;
        final G g;
        final H h;

        f = new H();
        g = new H();
        h = new H();

        f.foo();
        System.out.println("---");
        g.foo();
        System.out.println("---");
        h.foo();
        System.out.println("---");
    }
}

/**
 * F.
 */
interface F {
    void foo();
}

/**
 * G.
 */
abstract class G implements F {
    public final void foo() {
        System.out.println("G::foo()");
        bar();
    }

    void bar() {
        System.out.println("G::bar()");
        car();
    }

    abstract void car();
}

/**
 * H.
 */
class H extends G {
    void car() {
        System.out.println("H::car");
    }
}
