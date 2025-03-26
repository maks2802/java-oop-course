package Lab4.task9;

import java.util.Scanner;

public class Task9 {
    static void sum(int... numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        System.out.println("Сума чисел дорівнює: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість чисел: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++ ) {
            System.out.print("Введіть " + (i + 1) + " число: ");
            numbers[i] = scanner.nextInt();
        }

        sum(numbers);

        scanner.close();
    }
}
