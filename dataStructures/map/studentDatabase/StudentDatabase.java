package code.dataStructures.map.studentDatabase;

import java.util.HashMap;
import java.util.Set;

/**
 * StudentDatabase.
 *
 * @author BCIT
 * @version 2020
 */
public class StudentDatabase {

    /**
     * Number of quizzes.
     */
    public static final int NUM_QUIZZES = 10;

    /**
     * Lowest possible quiz grade.
     */
    public static final int MIN_GRADE = 0;

    /**
     * Highest possible quiz grade.
     */
    public static final int MAX_GRADE = 100;

    private HashMap<String, int[]> studentList;

    /**
     * Constructor for objects of class StudentDatabase.
     */
    public StudentDatabase() {
        studentList = new HashMap<String, int[]>();
    }

    /**
     * Formats a name to lower case.
     *
     * @param nameToFormat name to format
     * @return the formatted name as a String
     */
    public static String formatName(final String nameToFormat) {
        if (nameToFormat == null) {
            return null;
        }
        return nameToFormat.trim().toLowerCase();
    }

    /**
     * Adds a new student to the database and creates space for NUM_QUIZZES
     * marks. Disallows null name and Strings composed of white space.
     *
     * @param studentName the name of the student to add
     */
    public void addStudent(final String studentName) {
        if (studentName != null && studentName.trim().length() > 0) {
            studentList.put(formatName(studentName), createQuizzes());
        }
    }

    /*
     * Creates a new code.arrays to hold comp2526.quizzes and initializes each to MIN_GRADE.
     *
     * @return code.arrays of int set to 0, with space for NUM_QUIZZES grades
     */
    private int[] createQuizzes() {
        int[] quizzes = new int[NUM_QUIZZES];
        for (int i = 0; i < quizzes.length; i++) {
            quizzes[i] = MIN_GRADE;
        }
        return quizzes;
    }

    /**
     * Returns an code.arrays of quiz marks for the specified student. If the
     * specified student is not in the database, returns null.
     *
     * @param student the student whose quiz marks we want
     * @return quiz marks as an code.arrays of int
     */
    public int[] getQuizzes(final String student) {
        return studentList.get(formatName(student));
    }

    /**
     * Changes the mark for the specified student and quiz.
     *
     * @param studentName the student for whom a new quiz mark exists
     * @param whichQuiz   the index of the quiz mark to change
     * @param newMark     the new quiz mark to be entered
     */
    public void changeQuizMark(final String studentName, final int whichQuiz, final int newMark) {
        String name = formatName(studentName);
        if (!studentList.containsKey(name)) {
            System.out.println(name + " is not in the database.");
        } else if (whichQuiz < 0 || whichQuiz >= NUM_QUIZZES) { // zero-indexed
            System.out.println(whichQuiz + " is not a valid quiz.");
        } else if (newMark < MIN_GRADE || newMark > MAX_GRADE) {
            System.out.println(newMark + " is not a valid grade.");
        } else { // all ok so change quiz mark
            int[] studentQuizzes = getQuizzes(name);
            studentQuizzes[whichQuiz] = newMark;
            studentList.put(name, studentQuizzes);
        }
    }

    /**
     * Displays the quiz marks for all students.
     */
    public void showQuizMarks() {
        Set<String> names = studentList.keySet();
        if (studentList.size() > 0) {
            for (String student : names) {
                int[] quizzes = getQuizzes(student);
                System.out.println("Quiz marks for: " + student);
                for (int q : quizzes) {
                    System.out.print(q + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No students enrolled yet.");
        }
    }
}
