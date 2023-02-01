package code.inheritance.orderOfInitialization;

abstract class Drink {
    public abstract void pour();

    public void drink() {
        System.out.println("burp");
    }
}

class Beer extends Drink {
    @Override
    public void pour() {
        System.out.println("foam");
    }
}

class Juice extends Drink {
    @Override
    public void pour() {
        System.out.println("slosh");
    }

    @Override
    public void drink() {
        System.out.println("smack");
    }
}

class CraftBeer extends Beer {
    @Override
    public void drink() {
        super.drink();
        System.out.println("Meh. I think they're over-hyped.");
    }
}

/**
 * What's happening here?
 *
 * @author BCIT
 * @version 2020
 */
public class Glass {

    /**
     * Drives the program.
     * @param args
     */
    public static void main(String[] args) {
        Drink d = new Juice();
        d.pour();
        d.drink();
        d = new Beer();
        d.pour();
        d.drink();
        d = new CraftBeer();
        d.pour();
        d.drink();
    }
}
