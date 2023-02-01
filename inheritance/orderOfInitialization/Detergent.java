package code.inheritance.orderOfInitialization;

class Cleanser {
    private String s = new String("Cleanser");

    public Cleanser() { }

    public Cleanser(String s) {
        this.s = s;
    }

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public void print() {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        x.print();
    }
}

/**
 * Which versions of the methods are called?
 *
 * @author BCIT
 * @version 2020
 */
public class Detergent extends Cleanser {

    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Call base-class version
    }

    public void foam() {
        append(" foam()");
    }

    /**
     * Drives the program.
     * @param args
     */
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.print();
        System.out.println("Testing base class:");
        Cleanser.main(args); // Wait what digital witchcraft is this?
                             // We can do this?
                             // Yes!  It's just a static method, after all!
    }
}