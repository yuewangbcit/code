package code.inheritance.introToInheritance.polymorphism;

/**
 * Polymorphism demo.
 *
 * @author BCIT
 * @version 2020
 */
public class Polymorphism2 {
    /**
     * Drives the program.
     * @param argv
     */
    public static void main(final String[] argv) {
        final C cc;
        final C cd;
        final C ce;
        final D d;
        final E e;

        cc = new C();
        cd = new D();
        ce = new E();
        d = new D();
        e = new E();

        cc.foo();
        System.out.println("---");
        cd.foo();
        System.out.println("---");
        ce.foo();
        System.out.println("---");
        d.foo();
        System.out.println("---");
        e.foo();
    }
}

/**
 * C.
 */
class C {
    void foo() {
        System.out.println("C::foo");
        bar();
    }

    void bar() {
        System.out.println("C::bar");
    }
}

/**
 * D.
 */
class D
        extends C {
    void foo() {
        System.out.println("D::foo");
    }

    void bar() {
        System.out.println("D::bar");
    }
}

/**
 * E.
 */
class E
        extends C {
    void bar() {
        System.out.println("E::bar");
    }
}
