package Lab9.task5;

public class SMSNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
