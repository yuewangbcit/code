package code.java101.staticModifier;

/**
 * Demonstrates the use of the static modifier.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class SloganCounter {

    /**
     * Creates several Slogan objects and prints the number of objects that were
     * created.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        Slogan obj;
        System.out.println(Slogan.getCount());

        obj = new Slogan("Remember the Alamo.");
        System.out.println(obj);
        System.out.println(Slogan.getCount());

        obj = new Slogan("Don't Worry. Be Happy.");
        System.out.println(obj);
        System.out.println(Slogan.getCount());

        obj = new Slogan("Live Free or Die.");
        System.out.println(obj);
        System.out.println(Slogan.getCount());

        obj = new Slogan("Talk is Cheap.");
        System.out.println(obj);
        System.out.println(Slogan.getCount());

        obj = new Slogan("Write Once, Run Anywhere.");
        System.out.println(obj);
        System.out.println(Slogan.getCount());

        System.out.println();
        System.out.println("Slogans created: " + Slogan.getCount());

    }
}

