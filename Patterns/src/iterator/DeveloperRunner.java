package iterator;

/**
 * Created by daniel on 30/11/16.
 */
public class DeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"java", "spring","hibernate","maven"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Daniel Volkov",skills);
        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer" + javaDeveloper.getName());
        System.out.println("skills");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
