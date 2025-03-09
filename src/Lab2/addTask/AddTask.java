package Lab2.addTask;

import java.util.Scanner;

public class AddTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть пошту: ");
        String email = scanner.nextLine();

        int atSign = email.indexOf("@");

        String username = email.substring(0, atSign);
        String domain = email.substring(atSign + 1);

        System.out.println("Ім'я користувача: " + username);
        System.out.println("Домен: " + domain);

        scanner.close();
    }
}