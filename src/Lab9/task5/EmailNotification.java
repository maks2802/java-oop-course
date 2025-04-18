package Lab9.task5;

public class EmailNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
