package code.java101.students;

/**
 * Represents a BCIT student.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class Student {

    private final String firstName;
    private final String lastName;
    private final Address homeAddress;
    private final Address schoolAddress;

    /**
     * Constructs a Student object that contains the specified values.
     *
     * @param firstName  a String representing the usefulclasses name
     * @param lastName   a String representing the last name
     * @param homeAddress   an Address object containing the home address
     * @param schoolAddress an Address object containing the school address
     */
    public Student(final String firstName,
                   final String lastName,
                   final Address homeAddress,
                   final Address schoolAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (!firstName.equals(student.firstName)) return false;
        if (!lastName.equals(student.lastName)) return false;
        if (!homeAddress.equals(student.homeAddress)) return false;
        return schoolAddress.equals(student.schoolAddress);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + homeAddress.hashCode();
        result = 31 * result + schoolAddress.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", homeAddress=" + homeAddress +
                ", schoolAddress=" + schoolAddress +
                '}';
    }
}

