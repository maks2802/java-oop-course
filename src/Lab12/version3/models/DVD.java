package Lab12.version3.models;

public class DVD extends LibraryItem {
    private int duration;

    public DVD(String title, int year, int duration) {
        super(title, year);
        this.duration = duration;
    }

    @Override
    public String getInfo() {
        return "\nDVD: \nTitle: " + title + ", \nYear: " + year + ", \nDuration: " + duration + " min, \nIs Available: " + (isAvailable() ? " [Available]" : " [Borrowed]");
    }
}
