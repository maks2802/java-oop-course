package Lab12.version3.services;

import Lab12.version3.models.Book;
import Lab12.version3.models.LibraryItem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void listAvailableItems() {
        for (LibraryItem item : items) {
            if (item.isAvailable()) {
                System.out.println(item.getInfo());
            }
        }
    }

    public LibraryItem findItem(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }

    public void borrowItem(LibraryItem item, User user) {
        if (item != null && item.isAvailable()) {
            if (item instanceof Book book && book.isReserved()) {
                System.out.println("Cannot borrow " + book.getTitle() + ". It is reserved.");
                return;
            }
            item.borrowItem();
            user.addBorrowedItem(item);
            System.out.println(user.getName() + " borrowed: " + item.getTitle());
        }
    }

    public void returnItem(LibraryItem item, User user) {
        if (item != null) {
            item.returnItem();
            user.removeBorrowedItem(item);
            System.out.println(user.getName() + " returned: " + item.getTitle());
        }
    }
}
