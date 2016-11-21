package abstractFactory.banking;

import abstractFactory.ProjectManager;

/**
 * Created by daniel on 21/11/16.
 */
public class BankingPM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("manage project...");
    }
}
