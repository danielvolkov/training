package facade;

/**
 * Created by daniel on 28/11/16.
 */
public class Developer {
    void doJobBeforeDeadLine(BugTracker bugTracker){
        if(bugTracker.isActiveSprint()){
            System.out.println("dev solving problems");
        } else {
            System.out.println("dev reading habrahabr");
        }
    }
}
