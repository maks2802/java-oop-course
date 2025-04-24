package Lab9.task5;

public class PushNotification extends Notification {

    public PushNotification(String message) {
        super(message);
    }

    @Override
    void send() {
        System.out.println("Sending push notification: " + message);
    }
}
