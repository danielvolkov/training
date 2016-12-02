package observer;

/**
 * Created by Daniil Volkov on 02.12.2016.
 */
public interface Observed {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
