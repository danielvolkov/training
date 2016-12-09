package state;

/**
 * Created by Daniil Volkov on 02.12.2016.
 */
public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void  changeActivity(){
        if (activity instanceof Coding){
            setActivity(new Training());
        } else if(activity instanceof Training){
            setActivity(new Reading());
        } else if(activity instanceof Reading){
            setActivity(new Sleeping());
        } else if (activity instanceof Sleeping){
            setActivity(new Coding());
        }
    }
    public  void justDoIt(){
        activity.justDoIt();
    }
}
