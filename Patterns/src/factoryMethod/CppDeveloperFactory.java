package factoryMethod;

/**
 * Created by daniel on 21/11/16.
 */
public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
