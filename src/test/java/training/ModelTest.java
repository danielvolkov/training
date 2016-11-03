package training;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by daniel on 29/10/16.
 */
public class ModelTest {
    public static final int VALUE = 100;
    public static final int MIN = 0;
    public static final int MAX = 100;
    public Model model;

    // initialization model parametrs
    @Before
    public void modelInit(){
        model = new Model();
        model.setSecretValue();
    }
    // test comparation values
    @Test
    public void compareValueTest(){
        assertTrue(model.checkValue(VALUE));
    }
    // test last iteration, when no more variants to guess ( max-min)
    // wait true
    @Test
    public void zeroDifferenceTrueTest(){
        model.setMin(VALUE);
        model.setMax(MAX);
        assertTrue(model.isZeroDifference());
    }
    // wait false
    @Test
    public void zeroDifferenceFalseTest(){
        model.setMin(MIN);
        model.setMax(MAX);
        assertFalse(model.isZeroDifference());
    }

}
