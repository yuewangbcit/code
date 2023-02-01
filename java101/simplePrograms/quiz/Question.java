package code.java101.simplePrograms.quiz;

/**
 * Represents a question (and its answer).
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class Question implements Complexity {
    /**
     * Stored question.
     */
    private String question;

    /**
     * Stored answer.
     */
    private String answer;

    /**
     * Complexity level for question.
     */
    private int complexityLevel;

    /**
     * Constructs a Question with specified query and result and a default
     * complexity.
     *
     * @param query  a String
     * @param result a String
     */
    public Question(String query, String result) {
        question = query;
        answer = result;
        complexityLevel = 1;
    }

    /**
     * Returns the complexity level for this question.
     *
     * @return complexityLevel as an int
     */
    public int getComplexity() {
        return complexityLevel;
    }

    /**
     * Sets the complexity level for this question.
     *
     * @param level an int
     */
    public void setComplexity(int level) {
        complexityLevel = level;
    }

    /**
     * Returns the question.
     *
     * @return question as a String
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Returns the answer to this question.
     *
     * @return answer as a String
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Returns true if the candidate answer matches the answer, else false.
     *
     * @param candidateAnswer a String
     * @return true if answers match, else false
     */
    public boolean answerCorrect(String candidateAnswer) {
        return answer.equals(candidateAnswer);
    }

    /**
     * Returns this question (and its answer) as a string.
     *
     * @return toString description
     */
    public String toString() {
        return question + "\n" + answer;
    }
}

