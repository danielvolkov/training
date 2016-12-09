package observer;

import java.util.List;

/**
 * Created by Daniil Volkov on 02.12.2016.
 */
public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear "+name+" we had some changes.." + vacancies );
    }
}
