package code.dataStructures.queue;

import java.util.PriorityQueue;

/**
 * PriorityQueueTest.
 *
 * @author BCIT
 * @version 2019
 */
public final class PriorityQueueDemo {

    private PriorityQueueDemo() {

    }

    /**
     * Drives the program.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {

        PriorityQueue<Double> queue = new PriorityQueue<>();
        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);
        System.out.print("Polling from queue: ");
        while (queue.size() > 0) {
            System.out.printf("%.1f ", queue.peek());
            queue.poll();
        }
    }
}
