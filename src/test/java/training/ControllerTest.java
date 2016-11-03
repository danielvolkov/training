package training;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by daniel on 29/10/16.
 */
public class ControllerTest {
    public static final String EMPTY_VALUE = "";
    public static final String STRING_VALUE = "q";
    public static final String INT_VALUE = "67";
    public static final String BOUNDARY_MAX = "100";
    public static final String BOUNDARY_MIN = "0";
    public static final String INT_OUT_OF_RANGE = "101";
    private Controller controller;
    private List<String> userStringInputs;

    // initialization parametrs for following tests
    @Before
    public void initController(){
        userStringInputs = new ArrayList<>();
        userStringInputs.add(EMPTY_VALUE);
        userStringInputs.add(STRING_VALUE);
        userStringInputs.add(INT_VALUE);
        Model model = new Model();
        View view = new View();
        controller = new Controller(model,view);
        model.setSecretValue();
        model.setMin(GlobalConstants.PRIMARY_MIN_BARRIER);
        model.setMax(GlobalConstants.PRIMARY_MAX_BARRIER);
    }

    // simulate wrong user inputs until correct
    @Test
    public void wrongInputTest(){
        for (String userInput:userStringInputs  ) {
            System.setIn(new ByteArrayInputStream(userInput.getBytes()));
        }
        Scanner scanner = new Scanner(System.in);
        int currentValue = controller.validateInputValue(scanner);
        assertEquals(currentValue,Integer.parseInt(INT_VALUE));
    }
    // simulate correct user inputs
    @Test
    public void intInputTest(){
        System.setIn(new ByteArrayInputStream(INT_VALUE.getBytes()));
        Scanner scanner = new Scanner(System.in);
        int currentValue = controller.validateInputValue(scanner);
        assertEquals(currentValue,Integer.parseInt(INT_VALUE));
    }
    // check boundary max value
    @Test
    public void maxIntInputTest(){
        System.setIn(new ByteArrayInputStream(BOUNDARY_MAX.getBytes()));
        Scanner scanner = new Scanner(System.in);
        int currentValue = controller.validateInputValue(scanner);
        assertEquals(currentValue,Integer.parseInt(BOUNDARY_MAX));
    }
    // check boundary min value
    @Test
    public void minIntInputTest(){
        System.setIn(new ByteArrayInputStream(BOUNDARY_MIN.getBytes()));
        Scanner scanner = new Scanner(System.in);
        int currentValue = controller.validateInputValue(scanner);
        assertEquals(currentValue,Integer.parseInt(BOUNDARY_MIN));

    }
    // check out of range value
    @Test
    public void outOfIntRangeTest(){
        System.setIn(new ByteArrayInputStream(INT_OUT_OF_RANGE.getBytes()));
        System.setIn(new ByteArrayInputStream(INT_VALUE.getBytes()));
        Scanner scanner = new Scanner(System.in);
        int currentValue = controller.validateInputValue(scanner);
        assertEquals(currentValue,Integer.parseInt(INT_VALUE));
    }

}
