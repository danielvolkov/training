package chainOfResposibility;

/**
 * Created by daniel on 30/11/16.
 */
public class EmailNotifier extends Notifier {
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("sending notifier " + message);
    }
}
