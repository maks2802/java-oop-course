package Lab10.extraTask;

public class NotificationReader extends Consumer {
    protected static int lastIndex = 0;

    @Override
    void readNewMessages() {
        System.out.println("\nNew messages: ");
        String[] messages = Storage.getMessages();
        int count = Storage.getCount();
        while (lastIndex < count) {
            System.out.println(messages[lastIndex++]);
        }
    }
}
