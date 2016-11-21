package abstractFactory.website;

import abstractFactory.ProjectManager;

/**
 * Created by daniel on 21/11/16.
 */
public class WebSitePM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("manage website project");
    }
}
