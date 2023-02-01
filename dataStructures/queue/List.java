package code.dataStructures.queue;

/**
 * ListNode.
 *
 * @author BCIT
 * @version 2019
 */
class ListNode {

    private Object data;
    private ListNode nextNode;

    /**
     * Constructs an object of type ListNode.
     *
     * @param object
     */
    ListNode(final Object object) {
        this(object, null);
    }

    /**
     * Constructs an object of type Card.
     *
     * @param object
     * @param node
     */
    ListNode(final Object object, final ListNode node) {
        data = object;
        nextNode = node;
    }

    /**
     * Returns the object in the ListNode.
     *
     * @return object
     */
    public Object getObject() {
        return data;
    }

    /**
     * Returns a reference to the next Node.
     *
     * @return object
     */
    public ListNode getNext() {
        return nextNode;
    }

    /**
     * Sets the next Node to be the argument.
     *
     * @param newNext a ListNode
     */
    public void setNext(final ListNode newNext) {
        nextNode = newNext;
    }
}

/**
 * List.
 *
 * @author BCIT
 * @version 2019
 */
public class List {

    private ListNode firstNode;
    private ListNode lastNode;
    private String name;

    /**
     * Constructs an object of type List.
     */
    public List() {
        this("list");
    }

    /**
     * Constructs an object of type List.
     *
     * @param listName a String
     */
    public List(final String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    /**
     * Inserts the argument at the front of the list.
     *
     * @param insertItem an object
     */
    public void insertAtFront(final Object insertItem) {
        if (isEmpty()) {
            firstNode = lastNode = new ListNode(insertItem);
        } else {
            firstNode = new ListNode(insertItem, firstNode);
        }
    }

    /**
     * Inserts the argument at the back of the list.
     *
     * @param insertItem an object
     */
    public void insertAtBack(final Object insertItem) {
        if (isEmpty()) {
            firstNode = lastNode = new ListNode(insertItem);
        } else {
            lastNode.setNext(new ListNode(insertItem));
            lastNode = lastNode.getNext();
        }
    }

    /**
     * Removes and returns the element at the front of the list.
     *
     * @return removedItem an object
     * @throws EmptyListException if this list is empty.
     */
    public Object removeFromFront() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException(name);
        }
        Object removedItem = firstNode.getObject();

        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.getNext();
        }
        return removedItem;
    }

    /**
     * Removes and returns the element at the back of the list.
     *
     * @return removedItem an object
     * @throws EmptyListException if this list is empty.
     */
    public Object removeFromBack() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException(name);
        }
        Object removedItem = lastNode.getObject();

        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListNode current = firstNode;

            while (current.getNext() != lastNode) {
                current = current.getNext();
            }
            lastNode = current;
            current.setNext(null);
        }
        return removedItem;
    }

    /**
     * Returns true if this list is empty.
     * @return true if empty else false
     */
    public boolean isEmpty() {
        return firstNode == null;
    }

    /**
     * Prints the list.
     */
    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s\n", name);
            return;
        }

        System.out.printf("The %s is: ", name);
        ListNode current = firstNode;

        while (current != null) {
            System.out.printf("%s ", current.getObject());
            current = current.getNext();
        }

        System.out.println("\n");
    }
}
