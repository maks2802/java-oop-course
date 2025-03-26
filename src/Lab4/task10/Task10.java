package Lab4.task10;

import java.util.Scanner;

public class Task10 {
    static void printNumbers(String message, int... numbers) {
        System.out.println("Повідомлення: " + message);
        System.out.print("Числа: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть повідомлення: ");
        String message = scanner.nextLine();
        System.out.print("Введіть кількість чисел: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++ ) {
            System.out.print("Введіть " + (i + 1) + " число: ");
            numbers[i] = scanner.nextInt();
        }

        printNumbers(message, numbers);

        scanner.close();
    }
}
