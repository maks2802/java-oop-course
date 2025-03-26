package Lab4.task11;

import java.util.Scanner;

public class Task11 {
    static void findMax(int... numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Найбільше число: " + max);
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

        findMax(numbers);

        scanner.close();
    }
}
