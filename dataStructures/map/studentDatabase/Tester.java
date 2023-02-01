package code.dataStructures.map.studentDatabase;

/**
 * Tester.
 *
 * @author BCIT
 * @version 2020
 */
public final class Tester {


    private Tester() {
    }

    /**
     * The main method is the point of entry. This is where the Java virtual
     * machine 'begins' the program.
     *
     * @param args command line arguments (we will learn about these later)
     */
    public static void main(final String[] args) {
        StudentDatabase students = new StudentDatabase();
        students.addStudent("Luli");
        students.addStudent("Chris");
        students.changeQuizMark("Luli", 0, 90);
        students.changeQuizMark("Chris", 0, 80);
        students.showQuizMarks();

        // We can also test our getQuizzes method like this:
        int[] luliQuizzes = students.getQuizzes("Luli");
        System.out.println("Printing contents of Luli's quiz mark code.arrays:");
        for (int i = 0; i < StudentDatabase.NUM_QUIZZES; i++) {
            System.out.print(luliQuizzes[i] + " ");
        }

    }

}
