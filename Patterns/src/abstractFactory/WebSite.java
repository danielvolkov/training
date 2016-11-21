package abstractFactory;

import abstractFactory.website.WebSiteTeamFactory;

/**
 * Created by daniel on 21/11/16.
 */
public class WebSite {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println(" creating web site ");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
