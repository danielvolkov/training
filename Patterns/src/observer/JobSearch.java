package observer;

/**
 * Created by Daniil Volkov on 02.12.2016.
 */
public class JobSearch {
    public static void main(String[] args) {

        JavaDeveloperJobsSite jobsSite = new JavaDeveloperJobsSite();
        jobsSite.addVacancy("first java position");
        jobsSite.addVacancy("second java position");

        Observer firstSubscrible = new Subscriber("Petro");
        Observer secondSubscrible = new Subscriber("Ivan");

        jobsSite.addObserver(firstSubscrible);
        jobsSite.addObserver(secondSubscrible);

        jobsSite.addVacancy("third java position");
    }
}
