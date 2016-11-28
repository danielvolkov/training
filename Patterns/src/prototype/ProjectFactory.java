package prototype;

/**
 * Created by daniel on 28/11/16.
 */
public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    Project cloneProject(){
        return (Project) project.copy();
    }
}
