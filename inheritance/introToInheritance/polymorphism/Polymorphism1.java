package code.inheritance.introToInheritance.polymorphism;

/**
 * Polymorphism demo.
 *
 * @author BCIT
 * @version 2020
 */
public class Polymorphism1 {

    /**
     * Drives the program.
     * @param argv
     */
    public static void main(final String[] argv) {
        final A aa;
        final B bb;
        final A ab;
        
        aa = new A();
        bb = new B();
        ab = new B();
        
        aa.foo();
        System.out.println("---");
        bb.foo();
        System.out.println("---");
        ab.foo();
        System.out.println("---");
        bb.bar();
        System.out.println("---");
        // ab.bar(); <- will this compile?
    }
}

/**
 * A
 */
class A {
    public void foo() {
        System.out.println("A::foo");
    }
}

/**
 * B
 */
class B extends A {
    public void foo() {
        System.out.println("B::foo");
    }
    
    public void bar() {
        System.out.println("B::foo");
    }
}
