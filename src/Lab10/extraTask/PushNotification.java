package Lab10.extraTask;

public class PushNotification extends Notification {

    public PushNotification(String message) {
        super("[Push] " + message);
    }

    @Override
    public void send() {
        Storage.addMessage(this.message);
        System.out.println("Sending push notification: " + this.message);
    }
}
