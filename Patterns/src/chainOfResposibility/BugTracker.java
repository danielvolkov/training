package chainOfResposibility;

/**
 * Created by daniel on 30/11/16.
 */
public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.RUNTIME);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifierManager("Everything is OK!", Priority.RUNTIME);
        reportNotifier.notifierManager("some troubles..", Priority.IMPORTANT);
        reportNotifier.notifierManager("Houston, we`ve had a problems!", Priority.ASAP);
    }
}
