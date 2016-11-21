package abstractFactory.website;

import abstractFactory.Tester;

/**
 * Created by daniel on 21/11/16.
 */
public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Test web site ");
    }
}
