package Lab11.version3.models;

public class RecurringTask extends Task{
    private String repeatFrequency;

    public RecurringTask(int id, String title, String repeatFrequency) {
        super(id, title);
        this.repeatFrequency = repeatFrequency;
    }

    @Override
    public String toString() {
        return super.toString() + ", \nRepeat: " + repeatFrequency;
    }
}
