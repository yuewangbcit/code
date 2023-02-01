package code.inheritance.introToInheritance.polymorphism;

/**
 * Polymorphism demo.
 *
 * @author BCIT
 * @version 2020
 */
public class Polymorphism4 {
    /**
     * Drives the program.
     * @param argv
     */
    public static void main(final String[] argv) {
        final I ii;
        final I ij;
        final J j;

        ii = new I();
        ij = new J();
        j = new J();

        ii.foo();
        System.out.println("---");
        ij.foo();
        System.out.println("---");
        j.foo();
    }
}

/**
 * I.
 */
class I {
    void foo() {
        System.out.println("I::foo()");
        bar();
    }

    void bar() {
        System.out.println("I::bar()");
    }
}

/**
 * J.
 */
class J extends I {
    void foo() {
        System.out.println("J::foo()");
        super.foo();
    }

    void bar() {
        System.out.println("J::bar()");
    }
}
