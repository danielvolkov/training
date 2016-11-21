package abstractFactory.website;

import abstractFactory.Developer;

/**
 * Created by daniel on 21/11/16.
 */
public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("write php code");
    }
}
