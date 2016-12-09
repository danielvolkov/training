package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniil Volkov on 02.12.2016.
 */
public class JavaDeveloperJobsSite implements Observed {
    List<String> vacancies = new ArrayList<>();
    List<Observer> subscribles = new ArrayList<>();
    public void addVacancy (String vacancy){
        this.vacancies.add(vacancy);
        notifyObservers();
    }
    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        this.subscribles.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribles.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:subscribles){
            observer.handleEvent(this.vacancies);
        }
    }
}
