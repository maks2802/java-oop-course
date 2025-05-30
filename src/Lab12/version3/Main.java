package Lab12.version3;

import Lab12.version3.handlers.UserInterface;
import Lab12.version3.models.Book;
import Lab12.version3.models.DVD;
import Lab12.version3.models.Magazine;
import Lab12.version3.services.Library;
import Lab12.version3.services.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        User user = new User("Max");
        UserInterface userInterface = new UserInterface(library, user);

        Book book1 = new Book("1984", 1949, "George Orwell");
        library.addItem(book1);

        Book book2 = new Book("Fahrenheit 451", 1953, "Ray Bradbury");
        book2.reserve();
        library.addItem(book2);

        Magazine magazine1 = new Magazine("Associated Press", 2025, 356);
        library.addItem(magazine1);

        Magazine magazine2 = new Magazine("Economist", 2022, 981);
        library.addItem(magazine2);

        DVD dvd1 = new DVD("Star Wars", 1977, 121);
        library.addItem(dvd1);

        DVD dvd2 = new DVD("Pulp Fiction", 1994, 154);
        library.addItem(dvd2);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 0) {
                System.out.println("Exiting Java Online Library. Have a great day!");
                break;
            }
            userInterface.handleChoice(choice);
        }
    }

    public static void displayMenu() {
        System.out.println("\nJava Online Library");
        System.out.println("1. Show all items");
        System.out.println("2. Borrow an item");
        System.out.println("3. Return an item");
        System.out.println("4. Exit");
        System.out.println("Choose an option: ");
    }
}
