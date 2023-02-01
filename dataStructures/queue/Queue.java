package code.dataStructures.queue;

/**
 * Queue implements a queue by using a list and only exposing
 * queue behaviours.  Neat!
 *
 * @author BCIT
 * @version 2020
 */
public class Queue {

    private List queueList;

    /**
     * Constructs an object of type Queue.
     */
    public Queue() {
        queueList = new List("queue");
    }

    /**
     * Enqueues the specified object.
     * @param object
     */
    public void enqueue(final Object object) {
        queueList.insertAtBack(object);
    }

    /**
     * Dequeues the next item from the queue.
     * @return object first item in the queue
     * @throws EmptyListException if the list is already empty
     */
    public Object dequeue() throws EmptyListException {
        return queueList.removeFromFront();
    }

    /**
     * Returns true if the queue is empty.
     * @return true if empty, else false
     */
    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    /**
     * Prints the queue.
     */
    public void print() {
        queueList.print();
    }
}
