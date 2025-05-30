package Lab10.extraTask;

public class EmailNotification extends Notification {

    public EmailNotification(String message) {
        super("[Email] " + message);
    }

    @Override
    public void send() {
        Storage.addMessage(this.message);
        System.out.println("Sending email: " + this.message);
    }
}
