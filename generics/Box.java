package code.generics;

/**
 * Box.
 *
 * @author BCIT
 * @version 2020
 */
public class Box<T> {

    private T t;

    /**
     * @param t
     */
    public void set(T t) {
        this.t = t;
    }

    /**
     * @return t
     */
    public T get() {
        return t;
    }

}
