package code.streams;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * A simple student.
 *
 * @author BCIT
 * @version 2021
 */
public class Student {

    /**
     * A student has a standing.
     */
    public enum Standing {
        HONOURS, SATISFACTORY, ON_PROBATION, GRADUATE
    }

    private final String name;
    private final LocalDate birthday;
    private Standing standing;
    private final String emailAddress;

    /**
     * Constructs an object of type Student. A new student has SATISFACTORY Standing.
     *
     * @param name a String
     * @param birthday a LocalDate
     * @param emailAddress a String
     */
    public Student(final String name, final LocalDate birthday, final String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.standing = Standing.SATISFACTORY;
        this.emailAddress = emailAddress;
    }

    /**
     * Returns age in years.
     * @return age in years as an int
     */
    public int getAgeInYears() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    /**
     * Returns name.
     * @return name as a String
     */
    public String getName() {
        return name;
    }

    /**
     * Returns student's Standing.
     * @return standing as a Student.Standing
     */
    public Standing getStanding() {
        return standing;
    }

    /**
     * Returns the email address.
     * @return email address as a String.
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the Standing.
     * @param standing a Student.Standing
     */
    public void setStanding(final Standing standing) {
        this.standing = standing;
    }

    /**
     * Returns true if the argument is equal to this Student, else false.
     * @param o an Object
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return getName().equals(student.getName())
                && birthday.equals(student.birthday)
                && getStanding() == student.getStanding()
                && getEmailAddress().equals(student.getEmailAddress());
    }

    /**
     * Returns a hashCode for this Student.
     * @return hashCode as an int
     */
    @Override
    public int hashCode() {
        return Objects.hash(getName(), birthday, getStanding(), getEmailAddress());
    }
}
