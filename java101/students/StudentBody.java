package code.java101.students;

/**
 * Demonstrates the use of an aggregate class.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class StudentBody {

    /**
     * Creates some Address and Student objects and prints them.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        final Address school =
                new Address("3700 Willingdon Ave.", "Burnaby", "BC", "V5G 3H2");

        final Address jHome =
                new Address("21 Jump Street", "Langley", "BC", "V3A 6K6");
        final Student john = new Student("John", "Smith", jHome, school);

        final Address mHome =
                new Address("123 SomeMain Street", "North Pole", "NU", "H0H 0H0");
        final Student marsha = new Student("Marsha", "Jones", mHome, school);

        System.out.println(john);
        System.out.println();
        System.out.println(marsha);
    }
}

