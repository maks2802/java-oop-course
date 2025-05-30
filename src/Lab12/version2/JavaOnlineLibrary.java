package Lab12.version2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaOnlineLibrary {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<String> books = new ArrayList<>();
    private static final List<String> userBooks = new ArrayList<>();

    public static void main(String[] args) {
        allBooks();
        while (true) {
            showMenu();
            int choice = getUserChoice();
            handleUserChoice(choice);
        }
    }

    private static void allBooks() {
        books.add("Title: 1984 \nAuthor: George Orwell \nYear: 1949");
        books.add("Title: Fahrenheit 451 \nAuthor: Ray Bradbury \nYear: 1953");
        books.add("Title: The Great Gatsby \nAuthor: F. Scott Fitzgerald \nYear: 1925");
        books.add("Title: The Lord of the Rings \nAuthor: J.R.R. Tolkien \nYear: 1954-1955");
        books.add("Title: Watchmen \nAuthor: Alan Moore \nYear: 1986–1987");
    }

    private static void showMenu() {
        System.out.println("\nJava Online Library");
        System.out.println("1. Show all books");
        System.out.println("2. Borrow a book");
        System.out.println("3. Return a book");
        System.out.println("4. Exit");
        System.out.println("Choose an option: ");
    }

    private static int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void handleUserChoice(int choice) {
        scanner.nextLine();
        switch (choice) {
            case 1 -> showBooks();
            case 2 -> borrowBook();
            case 3 -> returnBook();
            case 4 -> exitApp();
            default -> System.out.println("Invalid option. Try again.");
        }
    }

    private static void showBooks() {
        System.out.println("Available books: ");
        for (int i = 0; i < books.size(); i++) {
            System.out.println("\n" + (i + 1) + ". " + books.get(i));
        }
    }

    private static void borrowBook() {
        System.out.println("Enter book number to borrow: ");
        int borrowIndex = getValidIndex(books.size());
        if (borrowIndex != -1) {
            userBooks.add(books.remove(borrowIndex));
            System.out.println("Book marked as borrowed!");
        }
    }

    private static void returnBook() {
        System.out.println("Your borrowed books: ");
        if (userBooks.isEmpty()) {
            System.out.println("You haven't borrowed any book");
        } else {
            for (int i = 0; i < userBooks.size(); i++) {
                System.out.println("\n" + (i + 1) + ". " + userBooks.get(i));
            }
        }
        System.out.println("\nEnter book number to return: ");
        int returnIndex = getValidIndex(userBooks.size());
        if (returnIndex != -1) {
            books.add(userBooks.remove(returnIndex));
            System.out.println("Book returned!");
        }
    }

    private static int getValidIndex(int listSize) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        if (index < 0 || index >= listSize) {
            System.out.println("Invalid book number.");
            return -1;
        }
        return index;
    }

    private static void exitApp() {
        System.out.println("Exiting...");
        scanner.close();
        System.exit(0);
    }
}
