package factoryMethod;

/**
 * Created by daniel on 21/11/16.
 */
public class JavaDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
