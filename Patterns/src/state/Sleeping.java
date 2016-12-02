package state;

/**
 * Created by Daniil Volkov on 02.12.2016.
 */
public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("sleeping...");
    }
}
