package code.innerClasses;

/**
 * A Counter will return the index of the next element being counted.
 */
interface Counter {
    int next();
}

/**
 * Demonstrates the use of a local class.
 *
 * @author BCIT
 * @version 2020
 */
public class LocalInnerClass {

    private int count = 0;

    /**
     * Returns an instance of a Counter. What else does this do?
     * @param name
     * @return counter object. What does it do, though?
     */
    public Counter getCounter(final String name) {

        /**
         * A local class inside a method!
         */
        class LocalCounter implements Counter {

            /**
             * Local inner classes can have a constructor.
             */
            LocalCounter() {
                System.out.println("Constructing a LocalCounter which is a kind of Counter!");
            }

            /**
             * Prints the name and then returns the incremented count.
             * @return count an integer
             */
            public int next() {
                System.out.println(name); // We are allowed to access effectively final variables.
                return count++;
            }
        }
        return new LocalCounter();
    }

    /**
     * This is the same thing but using an anonymous class...
     * @param name a String
     * @return counter object.
     */
    Counter getCounter2(final String name) {
        return new Counter() {

            /* Anonymous inner classes can have a "instance initializer" but no constructors! */
            {
                System.out.println("Counter()");
            }

            /**
             * Returns the next count as an int.
             * @return count as an integer
             */
            public int next() {
                System.out.println(name); // Access local final
                return count++;
            }
        };
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        LocalInnerClass localInnerClass = new LocalInnerClass();

        Counter counterFirst = localInnerClass.getCounter("Local inner ");
        Counter counterSecond = localInnerClass.getCounter2("Anonymous inner ");

        final int upperBound = 5;
        for (int i = 0; i < upperBound; i++) {
            System.out.print(counterFirst.next() + " ");
        }

        for (int i = 0; i < upperBound; i++) {
            System.out.print(counterSecond.next() + " ");
        }
    }
}
