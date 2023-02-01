package code.inheritance.orderOfInitialization;

class Animal {
    // Identical to "private" alone
    private final void f() {
        System.out.println("Animal.f()");
    }

    // Also automatically "final"
    private void g() {
        System.out.println("Animal.g()");
    }
}

class Bird extends Animal {
    private final void f() {
        System.out.println("Bird.f()");
    }

    private void g() {
        System.out.println("Bird.g()");
    }
}

class Eagle extends Bird {
    public final void f() {
        System.out.println("Eagle.f()");
    }

    public void g() {
        System.out.println("Eagle.g()");
    }
}

/**
 * It only seems like you can override a private or private final method.
 *
 * @author BCIT
 * @version 2020
 */
public class OverridingPrivates {

    /**
     * Drives the illusion.
     *
     * @param args
     */
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.f();
        eagle.g();

        Bird bird = eagle; // We can upcast

        // ! bird.f(); // But we can't call the methods
        // ! bird.g(); // But we can't call the methods

        Animal animal = eagle;
        // ! animal.f();
        // ! animal.g();
    }
}