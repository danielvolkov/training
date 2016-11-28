package decorator;

/**
 * Created by daniel on 28/11/16.
 */
public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }
    public String makeCodeReview(){
        return "Make code review";
    }
    @Override
    public String makeJob(){
        return super.makeJob()+makeCodeReview();
    }
}
