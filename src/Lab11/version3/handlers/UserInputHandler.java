package Lab11.version3.handlers;

import java.util.Scanner;

public class UserInputHandler {
    private static Scanner scanner = new Scanner(System.in);

    public static String getStringInput(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public static int getIntInput(String message) {
        System.out.println(message);
        while (!scanner.hasNextInt()) {
            System.out.println(" Invalid input. Please enter a number.");
            scanner.next();
        }

        int intInput = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after nextInt()

        return intInput;
    }
}