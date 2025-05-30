package Lab12.version3.models;

public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, int year, int issueNumber) {
        super(title, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getInfo() {
        return "\nMagazine: \nTitle: " + title + ", \nYear: " + year + ", \nIssue Number: " + issueNumber + ", \nIs Available: " + (isAvailable() ? " [Available]" : " [Borrowed]");
    }
}
