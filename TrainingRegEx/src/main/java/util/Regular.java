package util;

/**
 * Regular enum
 * has regular expressions
 * Created by daniel.volkov on 05/11/16.
 */
public enum Regular {
    NAMES("^[A-Z][a-z]{2,20}$"),
    NICK_NAME("^[a-zA-Z][a-zA-Z0-9-_.]{2,20}$"),
    COMMENT("^[a-zA-Z\\s0-9]{0,200}$"),
    HOME_MOBILE_PHONE("^[0-9]\\d{2}-\\d{3}-\\d{4}$"),
    MOBILE_PHONE_SECOND("^$|[0-9]\\d{2}-\\d{3}-\\d{4}"),
    EMAIL("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$"),
    INDEX("^[0-9]{5}$"),
    CITY("^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$"),
    STREET("^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$"),
    HOUSE("^[0-9]+[a-z]$"),
    APARTMENT("^[0-9]+$");

    private final String regEx;

    /**
     * Constructor
     * @param regEx
     */
    Regular(final String regEx) {
        this.regEx = regEx;
    }

    public String get() {
        return regEx;
    }
}
