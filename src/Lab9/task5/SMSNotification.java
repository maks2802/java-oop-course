package Lab9.task5;

public class SMSNotification extends Notification {

    public SMSNotification(String message) {
        super(message);
    }

    @Override
    void send() {
        System.out.println("Sending SMS: " + message);
    }
}
