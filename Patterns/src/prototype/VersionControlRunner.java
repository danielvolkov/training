package prototype;

/**
 * Created by daniel on 28/11/16.
 */
public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1,"Super project","SourceCode sourceCode = new Sourcecode();");
        System.out.println(master);
        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
    }
}
