package abstractFactory.website;

import abstractFactory.Developer;
import abstractFactory.ProjectManager;
import abstractFactory.ProjectTeamFactory;
import abstractFactory.Tester;

/**
 * Created by daniel on 21/11/16.
 */
public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
