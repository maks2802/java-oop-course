package Lab12.version3.services;

import Lab12.version3.models.LibraryItem;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<LibraryItem> borrowedItems;

    public User(String name) {
        this.name = name;
        this.borrowedItems = new ArrayList<>();
    }

    public void addBorrowedItem(LibraryItem item) {
        borrowedItems.add(item);
    }

    public void removeBorrowedItem(LibraryItem item) {
        borrowedItems.remove(item);
    }

    public void listBorrowedItems() {
        if (borrowedItems.isEmpty()) {
            System.out.println("No books are borrowed.");
        } else {
            for (LibraryItem item : borrowedItems) {
                System.out.println(item.getInfo());
            }
        }
    }

    public LibraryItem findBorrowedItem(String title) {
        for (LibraryItem item : borrowedItems) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}
