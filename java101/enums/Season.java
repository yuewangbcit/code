package code.java101.enums;

/**
 * Enumerates the values for Season.  Check this out.
 *
 * We can put a constructor in an enumeration.
 *
 * The constructor can accept parameters and assign them to
 * instance variables.  Each member of the enum can "construct"
 * itself.  We just need to put the appropriate arguments in
 * a set of parentheses after the constants.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public enum Season {


    winter("December through February"),
    spring("March through May"),
    summer("June through August"),
    fall("September through November");

    /**
     * Holds string to describe months of season.
     */
    private String span;

    /**
     * Constructor associates each value with a String.
     *
     * @param months the span of the Season.
     */
    Season(String months) {
        span = months;
    }

    /**
     * Returns the span for the value.
     *
     * @return span as a String
     */
    public String getSpan() {
        return span;
    }
}

