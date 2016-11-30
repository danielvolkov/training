package proxy;

/**
 * Created by daniel on 30/11/16.
 */
public class ProjectRunner  {
    public static void main(String[] args) {
        Project project = new ProxyProject("http://github.com/repo/project");
        project.run();
    }
}
