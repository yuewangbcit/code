package code.innerClasses;

/**
 * Base has a constructor that accepts and prints an integer. It also
 * declares an abstract method.
 *
 * @author BCIT
 * @author 2020
 */
abstract class Base {

    /**
     * Creates an object of type Base.
     * @param number an integer, a terrible variable name too
     */
    Base(final int number) {
        System.out.println("Base constructor, number = " + number);
    }

    /**
     * An abstract method to be overridden by a subclass of Base.
     */
    public abstract void f();
}

/**
 * This class returns an anonymous instance of an implementation of Base.
 *
 * Let's say that again. This class contains a static method that returns an instance of Base. But
 * Base is abstract! So it's actually returning a spur of the moment, right-here-right-now
 * implementation of the Base abstract class.
 *
 * Pay attention to the constructor. The Base constructor accepts a parameter. We pass the parameter
 * to the constructor (the first line of getBase) and then describe the anonymous class that extends
 * Base.
 *
 * @author BCIT
 * @version 2020
 */
public final class  AnonymousConstructor {

    private AnonymousConstructor() {

    }

    /**
     * Returns an instance of the Base class. Well, actually it returns a freshly made instance
     * of an implementation of the Base class.
     * @param number an integer (yes, this is a terrible variable
     * @return anonymousBase an instance of the Base class.
     */
    public static Base getBase(final int number) {

        return new Base(number) {
            // We can do stuff that initializes the new object inside a block like this
            {
                System.out.println("Inside instance initializer");
            }

            /**
             * An implementation specific to this instance being created and returned right now.
             */
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        final int ohMyGoshIam = 47;
        Base base = getBase(ohMyGoshIam);
        base.f();
    }
}
