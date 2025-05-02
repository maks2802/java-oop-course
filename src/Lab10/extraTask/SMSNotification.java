package Lab10.extraTask;

public class SMSNotification extends Notification {

    public SMSNotification(String message) {
        super("[SMS] " + message);
    }

    @Override
    public void send() {
        NotificationReader.addMessage(this.message);
        System.out.println("Sending SMS: " + this.message);
    }
}
