package code.inheritance.orderOfInitialization;

class Game {
    public Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    public BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}

/**
 * Pay attention to the order of execution.  This is quite
 * linear, but it demonstrates the fundamental principle
 * that the calls to super go all the way up the hierarchy.
 *
 * @author BCIT
 * @version 2020
 */
public class Chess extends BoardGame {
    public Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    /**
     * Drives the program.
     * @param args
     */
    public static void main(String[] args) {

        Chess x = new Chess();
    }
}