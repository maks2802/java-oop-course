package Lab9.task5;

public class Notification {
    String message;

    public Notification(String message) {
        this.message = message;
    }

    void send() {
        System.out.println("Sending generic notification: " + message);
    }
}
