package Lab4.task7;

import java.util.Scanner;

public class Task7 {
    static int counter = 0;

    static void increment() {
        counter += 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість збільшувань: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++ ) {
            increment();
        }

        System.out.println("Значення counter після " + count + " викликів: " + counter);

        scanner.close();
    }
}
