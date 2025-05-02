package Lab10.extraTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter email notification: ");
        String emailMessage = scanner.nextLine();

        System.out.print("Enter SMS notification: ");
        String smsMessage = scanner.nextLine();

        System.out.print("Enter push notification: ");
        String pushMessage = scanner.nextLine();

        System.out.println();

        Notification[] notifications = new Notification[3];
        notifications[0] = new EmailNotification(emailMessage);
        notifications[1] = new SMSNotification(smsMessage);
        notifications[2] = new PushNotification(pushMessage);

        for (Notification notification : notifications) {
            notification.send();
        }

        Consumer notificationReader = new NotificationReader();
        notificationReader.readNewMessages();

        scanner.close();
    }
}
