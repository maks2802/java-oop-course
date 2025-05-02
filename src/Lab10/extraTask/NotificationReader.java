package Lab10.extraTask;

public class NotificationReader extends Consumer {
    protected static String[] messages = new String[100];
    protected static int count = 0;
    protected static int lastIndex = 0;

    public static void addMessage(String message) {
        if (count < messages.length) {
            messages[count++] = message;
        }
    }

    @Override
    void readNewMessages() {
        System.out.println("\nNew messages: ");
        while (lastIndex < count) {
            System.out.println(messages[lastIndex++]);
        }
    }
}
