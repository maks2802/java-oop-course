package Lab12.version1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaOnlineLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> books = new ArrayList<>();
        List<String> userBooks = new ArrayList<>();

        books.add("Title: 1984 \nAuthor: George Orwell \nYear: 1949");
        books.add("Title: Fahrenheit 451 \nAuthor: Ray Bradbury \nYear: 1953");
        books.add("Title: The Great Gatsby \nAuthor: F. Scott Fitzgerald \nYear: 1925");
        books.add("Title: The Lord of the Rings \nAuthor: J.R.R. Tolkien \nYear: 1954-1955");
        books.add("Title: Watchmen \nAuthor: Alan Moore \nYear: 1986–1987");

        while (true) {
            System.out.println("\nJava Online Library");
            System.out.println("1. Show all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Available books: ");
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println("\n" + (i + 1) + ". " + books.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Enter book number to borrow: ");
                    int borrowIndex = scanner.nextInt() - 1;
                    if (borrowIndex >= 0 && borrowIndex < books.size()) {
                        userBooks.add(books.remove(borrowIndex));
                        System.out.println("Book marked as borrowed!");
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;
                case 3:
                    System.out.println("Your borrowed books: ");
                    if (userBooks.isEmpty()) {
                        System.out.println("You haven't borrowed any book");
                    } else {
                        for (int i = 0; i < userBooks.size(); i++) {
                            System.out.println("\n" + (i + 1) + ". " + userBooks.get(i));
                        }
                    }
                    System.out.println("\nEnter book number to return: ");
                    int returnIndex = scanner.nextInt() - 1;
                    if (returnIndex >= 0 && returnIndex < userBooks.size()) {
                        books.add(userBooks.remove(returnIndex));
                        System.out.println("Book returned!");
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
