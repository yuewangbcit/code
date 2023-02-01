package code.generics;

/**
 * OrderedPair.
 *
 * @author BCIT
 * @version 2020
 */
public class OrderedPair<K, V> {

    private K first;
    private V second;

    /**
     * Constructor for objects of type OrderedPair.
     *
     * @param key
     * @param value
     */
    public OrderedPair(K key, V value) {
        this.first = key;
        this.second = value;
    }

    /**
     * @return first the key
     */
    public K getFirst() {
        return first;
    }

    /**
     * @return second the value
     */
    public V getSecond() {
        return second;
    }

    /**
     * Returns true if the two specified ordered pairs are equivalent, else
     * false.
     *
     * @param p1
     * @param p2
     * @return true if the parameter objects are equivalent
     */
    public static <K, V> boolean equivalent(OrderedPair<K, V> p1,
                                            OrderedPair<K, V> p2) {
        return p1.getFirst().equals(p2.getFirst()) &&
                p1.getSecond().equals(p2.getSecond());
    }
}
