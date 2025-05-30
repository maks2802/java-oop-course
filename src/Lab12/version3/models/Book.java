package Lab12.version3.models;

import Lab12.version3.interfaces.Reservable;

public class Book extends LibraryItem implements Reservable {
    private String author;
    private boolean reserved = false;

    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    @Override
    public String getInfo() {
        return "\nBook: \nTitle: " + title + ", \nYear: " + year + ", \nAuthor: " + author + ", \nIs Available: " + (isAvailable() ? " [Available]" : " [Borrowed]") + ", \nIs Reserved: " + (isReserved() ? " [Yes]" : " [No]");
    }

    @Override
    public void reserve() {
        if (!isAvailable()) {
            System.out.println("Cannot reserve " + title + ". Already borrowed.");
        } else if (reserved) {
            System.out.println(title + " is already reserved.");
        } else {
            reserved = true;
            System.out.println("Book " + title + " has been reserved.");
        }
    }

    public boolean isReserved() {
        return reserved;
    }
}
