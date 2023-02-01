package code.java101.name;

/**
 * Name represents a three-part Name.
 *
 * @author BCIT
 * @version 2020
 */
public class Name {

    /**
     * Default first name.
     */
    public static final String DEFAULT_FIRST = "Boaty";

    /**
     * Default middle name.
     */
    public static final String DEFAULT_MIDDLE = "B";

    /**
     * Default last name.
     */
    public static final String DEFAULT_LAST = "McBoatface";

    private String first;
    private String middle;
    private String last;

    /**
     * Constructs an object of type Name.
     *
     * @param firstName  a String
     * @param middleName a String
     * @param lastName   a String
     */
    public Name(final String firstName, final String middleName, final String lastName) {

        if (firstName != null && firstName.trim().length() > 0) {
            this.first = firstName.trim().substring(0, 1).toUpperCase()
                    + firstName.trim().substring(1).toLowerCase();
        } else {
            this.first = DEFAULT_FIRST;
        }

        if (middleName != null && middleName.trim().length() > 0) {
            this.middle = middleName.trim().substring(0, 1).toUpperCase()
                    + middleName.trim().substring(1).toLowerCase();
        } else {
            this.middle = DEFAULT_MIDDLE;
        }

        if (lastName != null && lastName.trim().length() > 0) {
            this.last = lastName.trim().substring(0, 1).toUpperCase()
                    + lastName.trim().substring(1).toLowerCase();
        } else {
            this.last = DEFAULT_LAST;
        }
    }

    /**
     * Returns the first name.
     *
     * @return first as a String
     */
    public String getFirst() {
        return first;
    }

    /**
     * Sets the first name.
     *
     * @param first the  to set
     */
    public void setFirst(final String first) {
        if (first != null && first.trim().length() > 0) {
            this.first = first.trim().substring(0, 1).toUpperCase()
                    + first.trim().substring(1).toLowerCase();
        }
    }

    /**
     * Returns the middle name.
     *
     * @return middle
     */
    public String getMiddle() {
        return middle;
    }

    /**
     * Sets the middle name.
     *
     * @param middle the middle to set
     */
    public void setMiddle(final String middle) {
        if (middle.trim().length() > 0) {
            this.middle = middle.trim().substring(0, 1).toUpperCase()
                    + middle.trim().substring(1).toLowerCase();
        }
    }

    /**
     * Returns the last name.
     *
     * @return last
     */
    public String getLast() {
        return last;
    }

    /**
     * Sets the last name.
     *
     * @param last the last to set
     */
    public void setLast(final String last) {
        if (last.trim().length() > 0) {
            this.last = last.trim().substring(0, 1).toUpperCase()
                    + last.trim().substring(1).toLowerCase();
        }
    }

    /**
     * Returns the length of this Name.
     *
     * @return length
     */
    public int getLength() {
        return first.length() + middle.length() + last.length();
    }

    /**
     * Returns this Name as three uppercase initials.
     *
     * @return initials
     */
    public String getInitials() {
        return first.substring(0, 1).toUpperCase()
                + middle.substring(0, 1).toUpperCase()
                + last.substring(0, 1).toUpperCase();
    }

    /**
     * Returns the specified character in this Name.  If the
     * index exceeds the length of the String, '@' is
     * returned instead.  Index must be between [0, length() - 1]
     *
     * @param index the nth character to acquire
     * @return index character, or @ if index > length
     */
    public char getCharacter(final int index) {
        if (index >= getLength()) {
            return '@';
        } else {
            String fullName = first + middle + last;
            return fullName.charAt(index);
        }
    }

    /**
     * Returns Name formatted as "LastName, FirstName MiddleName".
     *
     * @return formatted as Last, First Middle
     */
    public String getFormattedName() {
        return last + ", " + first + " " + middle;
    }

    /**
     * Returns true if the specified String is the first name.
     *
     * @param name to compare
     * @return true if the same, else false
     */
    public boolean isFirstName(final String name) {
        return first.equals(name);
    }


    /**
     * Returns a String representation of this Name.
     *
     * @return Name as a String with the components labeled.
     */
    @Override
    public String toString() {
        return "Name{" + "first='"
                + first + '\''
                + ", middle='"
                + middle
                + '\''
                + ", last='"
                + last + '\''
                + '}';
    }


    /**
     * Returns true if the specified object is equal to this Name, else false.
     *
     * @param o an object
     * @return true if o and this Name are equal, else false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Name name = (Name) o;

        if (!getFirst().equals(name.getFirst())) {
            return false;
        }
        if (!getMiddle().equals(name.getMiddle())) {
            return false;
        }
        return getLast().equals(name.getLast());
    }

}
