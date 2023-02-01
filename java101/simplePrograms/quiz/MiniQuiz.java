package code.java101.simplePrograms.quiz;

import java.util.Scanner;

/**
 * Demonstrates the use of a class that implements an interface.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class MiniQuiz {

    /**
     * Average complexity.
     */
    private static final int AVERAGE = 4;

    /**
     * Difficult complexity.
     */
    private static final int DIFFICULT = 10;

    /**
     * Presents a short quiz.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        Question q1;
        Question q2;
        String possible;

        Scanner scan = new Scanner(System.in);

        q1 = new Question("What is the capital of Jamaica?", "Kingston");
        q1.setComplexity(AVERAGE);

        q2 = new Question("Which is worse, ignorance or apathy?",
                "I don't know and I don't care");
        q2.setComplexity(DIFFICULT);

        System.out.print(q1.getQuestion());
        System.out.println(" (Level: " + q1.getComplexity() + ")");

        possible = scan.nextLine();
        if (q1.answerCorrect(possible)) {
            System.out.println("Correct");
        } else {
            System.out.println("No, the answer is " + q1.getAnswer());
        }

        System.out.println();
        System.out.print(q2.getQuestion());
        System.out.println(" (Level: " + q2.getComplexity() + ")");

        possible = scan.nextLine();
        if (q2.answerCorrect(possible)) {
            System.out.println("Correct");
        } else {
            System.out.println("No, the answer is " + q2.getAnswer());
        }

        scan.close();
    }
}

