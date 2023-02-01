package code.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Show me some cool efficient and useful examples of streaming, Chris!
 *
 * Streaming is optimized. And fast! And easy to understand, and write!
 *
 * @author BCIT
 * @version 2021
 */
public final class StudentFun {

    private StudentFun() { }

    /**
     * Prints the names of the students in the collection using the for-each loop.
     * @param students a Collection of Student.
     */
    public static void printStudentNames(final Collection<Student> students) {
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    /**
     * Prints the names of the students in the collection using a simple stream.
     * @param students a Collection of Student.
     */
    public static void printStreamStudentNames(final Collection<Student> students) {
        students.stream().forEach(e -> System.out.println(e.getName()));
    }

    /**
     * Prints students who have graduated.
     * @param students a Collection.
     */
    public static void printStreamGraduates(final Collection<Student> students) {
        students
                .stream()
                .filter(e -> e.getStanding() == Student.Standing.GRADUATE)
                .forEach(e -> System.out.println(e.getName()));
    }

    /**
     * Calculate and returns the average grade of the students who have graduated.
     * @param students a Collection
     * @return average grade as a double
     */
    public static double getAverageGraduateAge(final Collection<Student> students) {
        return students
                .stream()
                .filter(e -> e.getStanding() == Student.Standing.GRADUATE)
                .mapToInt(Student::getAgeInYears)
                .average()
                .getAsDouble();
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {

        ArrayList<Student> studentsArrayList = new ArrayList<>();

        final int sampleSize = 10;
        for (int i = 0; i < sampleSize; ++i) {

            final int nameLength = 8;
            char[] name = new char[nameLength];
            for (int j = 0; j < nameLength; ++j) {
                name[j] = (char) (65 + new Random().nextInt(26));
            }
            String generatedName = new String(name);

            long minDay = LocalDate.of(1960, 1, 1).toEpochDay();
            long maxDay = LocalDate.of(2004, 1, 1).toEpochDay();
            long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
            LocalDate birthday = LocalDate.ofEpochDay(randomDay);

            Student student = new Student(generatedName, birthday, null);
            if (new Random().nextBoolean()) {
                student.setStanding(Student.Standing.GRADUATE);
            } else {
                student.setStanding(Student.Standing.SATISFACTORY);
            }
            studentsArrayList.add(student);

        }
        printStudentNames(studentsArrayList);
        printStreamStudentNames(studentsArrayList);
        printStreamGraduates(studentsArrayList);
        System.out.println(getAverageGraduateAge(studentsArrayList));
    }
}
