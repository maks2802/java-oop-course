package Lab9.task5;

public class PushNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("Sending push notification: " + message);
    }
}
