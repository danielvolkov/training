package facade;

/**
 * Created by daniel on 28/11/16.
 */
public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint(){
        System.out.println("sprint started");
        activeSprint = true;
    }

    public void finishSprint(){
        System.out.println("sprint finish");
        activeSprint = false;
    }
}
