package util;


/**
 * NoteEnum enum
 * use for common input for entity NOte
 * Created by daniel.volkov on 06/11/16.
 */
public enum NoteEnum {
    SURNAME("surname", "enter your surname, for example: Ivanov ",
            Regular.NAMES.get()),
    FIRST_NAME("first name", "enter your firstname, for example: James",
            Regular.NAMES.get()),
    PARTONOMIC("patronimic", "enter your surname, for example: Ivanovich",
            Regular.NAMES.get()),
    NICK_NAME("nick name", "should have more than 3 letters",
            Regular.NICK_NAME.get()),
    COMMENT("comment", "use not more than 200 symbols",
            Regular.COMMENT.get()),
    GROUP("group, choose one of: family coworkers friends other", "wrong!",
            ""),
    HOME_PHONE("home phone", "enter like 000-111-2233",
            Regular.HOME_MOBILE_PHONE.get()),
    MOBILE_PHONE("mobile phone", "enter like 044-111-2233",
            Regular.HOME_MOBILE_PHONE.get()),
    MOBILE_PHONE_SECOND("second mobile phone", "enter like 044-111-2233 or can be empty",
            Regular.MOBILE_PHONE_SECOND.get()),
    EMAIL("email", "wrong! for example: nick@mail.com",
            Regular.EMAIL.get()),
    SKYPE("skype", "like a simple nickname",
            Regular.NICK_NAME.get()),
    INDEX("index", "only 5 numbers",
            Regular.INDEX.get()),
    CITY("city", "enter your surname, for example: New-York",
            Regular.CITY.get()),
    STREET("street", "fnter your surname, for example: Baker",
            Regular.STREET.get()),
    HOUSE("house number", "not more than 5 symbols",
            Regular.HOUSE.get()),
    APARTMENT("apartment", "only number",
            Regular.APARTMENT.get());

    private final String field;
    private final String error;
    private final String regEx;

    /**
     * Constructor
     * @param field enter message
     * @param error error message in case of wrong input
     * @param regEx link on regular expression from enum Regular
     */
    NoteEnum(final String field, final String error, final String regEx) {
        this.field = field;
        this.error = error;
        this.regEx = regEx;
    }

    /**
     * Getters
     * @return correspondent values
     */
    public String getName() {
        return field;
    }
    public String getError() {
        return error;
    }
    public String getRegEx(){
        return regEx;
    }

}
