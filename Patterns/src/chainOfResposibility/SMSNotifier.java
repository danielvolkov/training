package chainOfResposibility;

/**
 * Created by daniel on 30/11/16.
 */
public class SMSNotifier extends Notifier {
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("sending SMS "+ message);
    }
}
