package decorator;

/**
 * Created by daniel on 28/11/16.
 */
public class JavaDeveloper implements Developer{
    @Override
    public String makeJob() {
        return "Write Java Code";
    }
}
