package code.dataStructures.queue;

/**
 * Demonstrates how to use a queue.
 *
 * @author BCIT
 * @version 2020
 */
public final class QueueDemo {

    private QueueDemo() {

    }

    /**
     * Drives the program.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {
        Queue queue = new Queue();

        queue.enqueue(-1);
        queue.print();
        queue.enqueue(0);
        queue.print();
        queue.enqueue(1);
        queue.print();
        queue.enqueue(5);
        queue.print();

        try {
            while (true) {
                Object removedObject = queue.dequeue();
                System.out.printf("%s dequeued\n", removedObject);
                queue.print();
            }
        } catch (EmptyListException emptyListException) {
            emptyListException.printStackTrace();
        }
    }
}
