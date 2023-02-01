package code.dataStructures.trees;

import java.util.Random;

/**
 * TreeTest.
 *
 * @author BCIT
 * @version 2020
 */
public final class TreeTest {

    private TreeTest() {
    }

    /**
     * Drives the program.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {
        Tree tree = new Tree();
        Random randomNumber = new Random();
        System.out.println("Inserting the following values: ");
        for (int i = 1; i <= 10; i++) {
            int value = randomNumber.nextInt(100);
            System.out.print(value + " ");
            tree.insertNode(value);
        }

        System.out.println("\n\nPreorder traversal");
        tree.preorderTraversal();

        System.out.println("\n\nInorder traversal");
        tree.inorderTraversal();

        System.out.println("\n\nPostorder traversal");
        tree.postorderTraversal();
    }
}
