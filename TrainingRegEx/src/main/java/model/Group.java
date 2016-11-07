package model;

/**
 * Group enum
 * Created by daniel.volkov on 05/11/16.
 */
public enum Group {
    FAMILY,
    COWOKERS,
    FRIENDS,
    OTHER;

    /**
     * toString method
     * @return string of enum field in lower case
     */
    public String toString() {
        String lowercase = name().toLowerCase(java.util.Locale.US);
        return lowercase;
    }
}
