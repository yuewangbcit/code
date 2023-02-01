package code.innerClasses;

/**
 * Look at this.
 *
 * It's an interface that contains a class.
 *
 * Why? Why would we ever want to do this?
 */
public interface ClassInInterface {

    /**
     * Greets in a Western manner.
     */
    void howdy();

    /**
     * A class inside an interface. A class inside an interface that implements the interface.
     *
     * Are you kidding me? Yes! We can do this. But why? Can you think of any
     * reason(s) why we would want to do this?
     */
    class Test implements ClassInInterface {

        /**
         * Greets in a Western manner.
         */
        public void howdy() {
            System.out.println("Howdy!");
        }

        /**
         * Drives the program. From inside a class. From inside an interface.
         * @param args unused
         */
        public static void main(final String[] args) {
            new Test().howdy(); // Invoke a method on a newly instantiated object...
        }
    }
}
