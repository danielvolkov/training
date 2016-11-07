package training;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by daniel on 29/10/16.
 */
public class ModelTest {
    public static final int MIN_TEST = 150;
    public static final int MAX_TEST = 200;
    public static final int MIN = 0;
    public static final int MAX = 100;
    public Model model;

    // initialization model parametrs
    @Before
    public void modelInit(){
        model = new Model();
        model.setPrimaryBarrier(MIN,MAX);
        model.setSecretValue();
    }
    // test comparation values
    @Test
    public void compareValueTest(){
        assertTrue(model.checkValue(model.getSecretValue()));
    }
    // test
    @Test
    public void setSecretValueTest(){
        model.setMin(MIN_TEST);
        model.setMax(MAX_TEST);
        model.setSecretValue();
        assertTrue(model.getSecretValue() > model.getMin() &&
                model.getSecretValue() < model.getMax() );
    }


}
