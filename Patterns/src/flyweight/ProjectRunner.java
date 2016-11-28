package flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 28/11/16.
 */
public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();
        List<Developer> developers = new ArrayList<>();
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
    for (Developer developer: developers){
        developer.writeCode();
    }
    }
}
