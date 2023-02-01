package code.inheritance.orderOfInitialization;

class Doodad {
}

/**
 * Uninitialized final data members must be initialized in
 * the constructor. The compiler will complain if you don't.
 *
 * @author BCIT
 * @version 2020
 */
public class UninitializedFinal {

    private final int i = 0;
    private final int j;
    private final Doodad d;

    UninitializedFinal() {
        j = 1; // Initialize blank final
        d = new Doodad();
    }

    UninitializedFinal(int x) {
        j = x; // Initialize blank final
        d = new Doodad();
    }

    /**
     * Drives the program.
     * @param args
     */
    public static void main(String[] args) {
        UninitializedFinal uninitializedFinal = new UninitializedFinal();
        uninitializedFinal = new UninitializedFinal(27);
    }
}