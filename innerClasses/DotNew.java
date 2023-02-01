package code.innerClasses;

/**
 * The DotNew class demonstrates how to instantiate an inner class.
 *
 * @author BCIT
 * @version 2020
 */
public class DotNew {

    /**
     * A public inner class.
     */
    public class Inner {
    }

    /**
     * Drives the program.
     *
     * What if this main method is inside a separate Driver class. Do we have to do anything
     * different to instantiate an Inner object?
     * @param args unused
     */
    public static void main(final String[] args) {
        DotNew dn = new DotNew();
        Inner dni = dn.new Inner();
    }


}
