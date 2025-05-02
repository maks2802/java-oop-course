package Lab10.extraTask;

public abstract class Notification implements Producer{
    protected String message;

    public Notification(String message) {
        this.message = message;
    }

    @Override
    public abstract void send();
}
