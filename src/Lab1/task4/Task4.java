package Lab1.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.print("Age cannot be negative.");
        } else {
            boolean isAdult = age <= 18;
            System.out.println("Is adult? " + isAdult);
        }

        scanner.close();
    }
}
