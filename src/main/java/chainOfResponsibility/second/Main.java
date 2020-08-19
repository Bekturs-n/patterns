package chainOfResponsibility.second;
/**
 * Another implementation of "Chain Of Responsibility" patterns
 *
 * links:
 * https://www.youtube.com/watch?v=66_0-u8P5DQ
 */
public class Main {
    public static void main(String[] args) {
        Notifier notifierReport = new SimpleReportNotifier(Priority.RUTINE);
        Notifier notifierEmail = new EmailNotifier(Priority.WARNING);
        Notifier notifierSms = new SMSNotifier(Priority.ASAP);

        notifierReport.setNextNotifier(notifierEmail);
        notifierEmail.setNextNotifier(notifierSms);

        notifierReport.notifierManager("Everything is ok ", Priority.RUTINE);
        System.out.println("====================================");
        notifierReport.notifierManager("Something went wrong ",Priority.WARNING);
        System.out.println("====================================");
        notifierReport.notifierManager("BiG ProBleM ", Priority.ASAP);

    }
}
