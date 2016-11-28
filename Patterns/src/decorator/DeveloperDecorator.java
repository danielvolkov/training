package decorator;

/**
 * Created by daniel on 28/11/16.
 */
public class DeveloperDecorator implements Developer {
    Developer developer;
    public DeveloperDecorator(Developer developer){
        this. developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
