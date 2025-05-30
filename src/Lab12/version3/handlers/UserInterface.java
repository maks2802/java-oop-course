package Lab12.version3.handlers;

import Lab12.version3.models.LibraryItem;
import Lab12.version3.services.Library;
import Lab12.version3.services.User;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private Library library;
    private User user;

    public UserInterface(Library library, User user) {
        this.library = library;
        this.user = user;
    }

    public void handleChoice(int choice) {
        switch (choice) {
            case 1 -> library.listAvailableItems();
            case 2 -> borrowBook();
            case 3 -> returnBook();
            case 4 -> exitApp();
            default -> System.out.println("Invalid option.");
        }
    }

    private void borrowBook() {
        System.out.println("Enter title to borrow:");
        String title = scanner.nextLine();
        LibraryItem item = library.findItem(title);
        if (item != null && item.isAvailable()) {
            library.borrowItem(item, user);
        } else {
            System.out.println("Item not found or already borrowed.");
        }
    }

    private void returnBook() {
        System.out.println("Your borrowed items: ");
        user.listBorrowedItems();
        System.out.println("Enter title to return:");
        String title = scanner.nextLine();
        LibraryItem item = user.findBorrowedItem(title);
        if (item != null) {
            library.returnItem(item, user);
        } else {
            System.out.println("You haven't borrowed this item.");
        }
    }

    private void exitApp() {
        System.out.println("Exiting...");
        System.exit(0);
    }
}
