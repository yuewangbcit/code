package code.generics;

/**
 * A simple Stack parameterized over E.
 *
 * @param <E> the data type
 * @author BCIT
 * @version 2020
 */
public class Stack<E> {

    private static final int DEFAULT_SIZE = 10;

    // number of elements in the stack
    private final int size;

    // location of the top element
    private int top;

    // array that stores stack elements
    private final E[] elements;

    /**
     * Constructs a Stack of size DEFAULT_SIZE
     */
    public Stack() {
        this(DEFAULT_SIZE);
    }

    /**
     * Constructs a Stack of size s.
     *
     * @param s an integer.
     */
    public Stack(int s) {
        size = s > 0 ? s : DEFAULT_SIZE;
        top = -1;
        elements = (E[]) new Object[size];
    }

    /**
     * Pushes the specified element onto the Stack.
     * @param pushValue
     * @return true if pushed, else throw FullStackException
     */
    public void push(E pushValue) {
        if (top == size - 1) // if stack is full
            throw new FullStackException(
                    String.format("Stack is full, cannot push %s", pushValue));

        elements[++top] = pushValue; // place pushValue on Stack
    }

    /**
     * Returns the top element if not empty, else throws an
     * EmptyStackException.
     * @return the top element
     */
    public E pop() {
        if (top == -1) // if stack is empty
            throw new EmptyStackException("Stack is empty, cannot pop");

        return elements[top--]; // remove and return top element of Stack
    }
}