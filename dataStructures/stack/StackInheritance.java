package code.dataStructures.stack;

/**
 * StackInheritance implements a stack by extending the
 * List and only exposing stack behaviours.  Neat!
 *
 * @author BCIT
 * @version 2019
 */
public class StackInheritance extends List {

    /**
     * Creates an object of type StackInheritance.
     */
    public StackInheritance() {
        super("stack");
    }

    /**
     * Pushes the argument onto this Stack.
     * @param object to add
     */
    public void push(final Object object) {
        insertAtFront(object);
    }

    /**
     * Pops and returns the top of the Stack.
     * @return top of the Stack
     * @throws EmptyListException if the Stack is empty.
     */
    public Object pop() throws EmptyListException {
        return removeFromFront();
    }
}
