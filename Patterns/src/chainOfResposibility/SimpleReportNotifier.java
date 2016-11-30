package chainOfResposibility;

/**
 * Created by daniel on 30/11/16.
 */
public class SimpleReportNotifier extends Notifier{
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("use simple notifier "+message);
    }
}
