package abstractFactory;

/**
 * Created by daniel on 21/11/16.
 */
public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
