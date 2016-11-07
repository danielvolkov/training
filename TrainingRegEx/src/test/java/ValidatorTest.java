import util.NoteEnum;
import org.junit.Assert;
import org.junit.Test;
import util.Regular;
import util.Validator;

/**
 * ValidatorTest class
 * Created by daniel.volkov on 05/11/16.
 */
public class ValidatorTest {

    public static final String[] TRUE_NAMES = {"Vasliy","Nicolas","Petro","Psihihi"};
    public static final String[] FALSE_NAMES = {"9HO","1koLya","1515"};
    public static final String[] GROUPS = {"family","friends","other"};
    public static final String[] PHONE = {"093-213-1234",""};

    // test validation true names
    @Test
    public void nameValidationTrueTest() {
        for (String str:TRUE_NAMES) {
            Assert.assertTrue(Validator.validate(str, NoteEnum.FIRST_NAME.getRegEx()));
        }
    }
    // test validation false names
    @Test
    public void nameValidationFalseTest() {
        for (String str:FALSE_NAMES) {
            Assert.assertFalse(Validator.validate(str, Regular.NAMES.get()));
        }
    }
    // test validation for group case
    @Test
    public void groupValidationTest() {
        for (String str:GROUPS) {
            Assert.assertTrue(Validator.validateGroup(str));
        }
    }
    // test validation in case of empty line with second mobile phone
    @Test
    public void secondPhoneValidationTest() {
        for (String str:PHONE) {
            Assert.assertTrue(Validator.validate(str, Regular.MOBILE_PHONE_SECOND.get()));
        }
    }


}
