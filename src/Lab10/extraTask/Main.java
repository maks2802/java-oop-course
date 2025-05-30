package Lab10.extraTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter email notification: ");
        String emailMessage1 = scanner.nextLine();

        System.out.print("Enter SMS notification: ");
        String smsMessage1 = scanner.nextLine();

        System.out.print("Enter push notification: ");
        String pushMessage1 = scanner.nextLine();

        System.out.println();

        Notification[] notifications = new Notification[3];
        notifications[0] = new EmailNotification(emailMessage1);
        notifications[1] = new SMSNotification(smsMessage1);
        notifications[2] = new PushNotification(pushMessage1);

        for (Notification notification : notifications) {
            notification.send();
        }

        Consumer notificationReader = new NotificationReader();
        notificationReader.readNewMessages();

        scanner.close();
    }
}
