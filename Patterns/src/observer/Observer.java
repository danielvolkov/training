package observer;

import java.util.List;

/**
 * Created by Daniil Volkov on 02.12.2016.
 */
public interface Observer {
    void handleEvent(List<String> vacancies);
}
