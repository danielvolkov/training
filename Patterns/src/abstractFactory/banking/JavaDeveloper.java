package abstractFactory.banking;

import abstractFactory.Developer;

/**
 * Created by daniel on 21/11/16.
 */
public class JavaDeveloper  implements Developer {
    @Override
    public void writeCode() {
        System.out.println("write code");
    }
}
