package Lab10.extraTask;

public class Storage {
    protected static String[] messages = new String[100];
    protected static int count = 0;

    public static void addMessage(String message) {
        if (count < messages.length) {
            messages[count++] = message;
        }
    }

    public static String[] getMessages() {
        return messages;
    }

    public static int getCount() {
        return count;
    }
}
