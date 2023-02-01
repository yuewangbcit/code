package code.innerClasses;

/**
 * An ordinary class doing ordinary things.
 */
class D {
}

/**
 * An ordinary abstract class doing nothing because it's abstract.
 */
abstract class A {
}

/**
 * An ordinary subclass that extends an ordinary class.
 */
class E extends D {

    /**
     * Returns an instance of the abstract class.
     * @return a an A.
     */
    A makeA() {
        return new A() {
        };
    }
}

/**
 * Demonstrates some neat stuff.
 *
 * @author BCIT
 * @version 2020
 */
public final class MultiImplementation {

    private MultiImplementation() {
    }

    /**
     * This method accepts a D.
     * @param d a D
     */
    static void takesD(final D d) {
    }

    /**
     * This method accepts an A.
     * @param a an A
     */
    static void takesA(final A a) {
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        E e = new E();
        takesD(e);
        takesA(e.makeA());
    }
}
