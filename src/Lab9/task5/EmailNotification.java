package Lab9.task5;

public class EmailNotification extends Notification {

    public EmailNotification(String message) {
        super(message);
    }

    @Override
    void send() {
        System.out.println("Sending email: " + message);
    }
}
