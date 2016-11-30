package strategy;

/**
 * Created by daniel on 30/11/16.
 */
public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if (activity instanceof Sleaping){
            setActivity(new Sleaping());
        } else if (activity instanceof Reading){
            setActivity(new Reading());
        } else if (activity instanceof Training){
            setActivity(new Training());
        } else if(activity instanceof Coding){
            setActivity(new Coding());
        }
    }

    public void executeActivity(){
        activity.justDoIt();
    }
}
