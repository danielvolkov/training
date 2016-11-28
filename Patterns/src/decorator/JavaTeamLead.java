package decorator;

/**
 * Created by daniel on 28/11/16.
 */
public class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport(){
        return "send week report to consumer";
    }
    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
