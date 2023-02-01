package code.dataStructures.linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * ListTest.
 *
 * @author BCIT
 * @version 2019
 */
public class ListDemo {

    private static final String[] COLOURS =
            {"black", "yellow", "green", "blue", "violet", "silver"};
    private static final String[] MORE_COLOURS =
            {"gold", "white", "brown", "blue", "gray", "silver"};

    /**
     * Constructs an object of type ListTest.
     */
    public ListDemo() {

        List<String> list1 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();

        for (String color : COLOURS) {
            list1.add(color);
        }
        for (String color : MORE_COLOURS) {
            list2.add(color);
        }

        list1.addAll(list2);
        printList(list1);
        convertToUppercaseStrings(list1);
        printList(list1);

        System.out.print("\nDeleting elements 4 to 6...");
        removeItems(list1, 4, 7);
        printList(list1);
        printReversedList(list1);
    }

    /**
     * Prints the specified list.
     * @param list a list of String
     */
    public void printList(final List<String> list) {
        System.out.println("\nlist: ");

        for (String color : list) {
            System.out.printf("%s ", color);
        }

        System.out.println();
    }

    /**
     * Converts the elements in the given list of String to uppercase.
     * @param list a list of String
     */
    private void convertToUppercaseStrings(final List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    /*
     * Removes the items in the specified index range from the specified list.
     */
    private void removeItems(final List<String> list, final int start, final int end) {
        list.subList(start, end).clear();
    }

    /*
     * Prints the specified list in reverse.
     */
    private void printReversedList(final List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());
        System.out.println("\nReversed List:");
        while (iterator.hasPrevious()) {
            System.out.printf("%s ", iterator.previous());
        }
    }

    /**
     * Drives the program.
     *
     * @param args command line arguments (unused)
     */
    public static void main(final String[] args) {
        new ListDemo();
    }
}
