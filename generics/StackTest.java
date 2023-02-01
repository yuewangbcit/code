package code.generics;

/**
 * Tests the Stack.
 *
 * @author BCIT
 * @version 2020
 */
public class StackTest {

    private double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
    private int[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    private Stack<Double> doubleStack; // stack stores Double objects
    private Stack<Integer> integerStack; // stack stores Integer objects

    /**
     * Tests the Stack methods.
     */
    public void testStacks() {
        doubleStack = new Stack<Double>(5); // Stack of Doubles
        integerStack = new Stack<Integer>(10); // Stack of Integers

        testPushDouble(); // push double onto doubleStack
        testPopDouble(); // pop from doubleStack
        testPushInteger(); // push int onto intStack
        testPopInteger(); // pop from intStack
    } // end method testStacks

    /**
     * Tests the Stack push method.
     */
    public void testPushDouble() {
        // push elements onto stack
        try {
            System.out.println("\nPushing elements onto doubleStack");

            // push elements to Stack
            for (double element : doubleElements) {
                System.out.printf("%.1f ", element);
                doubleStack.push(element); // push onto doubleStack
            } // end for
        } // end try
        catch (FullStackException fullStackException) {
            System.err.println();
            fullStackException.printStackTrace();
        } // end catch FullStackException
    }

    /**
     * Tests the Stack pop method.
     */
    public void testPopDouble() {
        // pop elements from stack
        try {
            System.out.println("\nPopping elements from doubleStack");
            double popValue; // store element removed from stack

            // remove all elements from Stack
            while (true) {
                popValue = doubleStack.pop(); // pop from doubleStack
                System.out.printf("%.1f ", popValue);
            } // end while
        } // end try
        catch (EmptyStackException emptyStackException) {
            System.err.println();
            emptyStackException.printStackTrace();
        } // end catch EmptyStackException
    } // end method testPopDouble

    /**
     * Tests the Stack push method.
     */
    public void testPushInteger() {
        // push elements to stack
        try {
            System.out.println("\nPushing elements onto integerStack");

            // push elements to Stack
            for (int element : integerElements) {
                System.out.printf("%d ", element);
                integerStack.push(element); // push onto integerStack
            } // end for
        } // end try
        catch (FullStackException fullStackException) {
            System.err.println();
            fullStackException.printStackTrace();
        } // end catch FullStackException
    }

    /**
     * Tests the Stack pop method.
     */
    public void testPopInteger() {
        // pop elements from stack
        try {
            System.out.println("\nPopping elements from integerStack");
            int popValue; // store element removed from stack

            // remove all elements from Stack
            while (true) {
                popValue = integerStack.pop(); // pop from intStack
                System.out.printf("%d ", popValue);
            } // end while
        } // end try
        catch (EmptyStackException emptyStackException) {
            System.err.println();
            emptyStackException.printStackTrace();
        } // end catch EmptyStackException
    } // end method testPopInteger

    /**
     * Drives the program.
     * @param args
     */
    public static void main(String args[]) {
        StackTest application = new StackTest();
        application.testStacks();
    }
}