package Lab3.task9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 100);
        }

        System.out.println("Початковий масив: " + Arrays.toString(array));

        System.out.print("Введіть індекс елементу масива: ");
        int index = scanner.nextInt();
        System.out.print("Введіть нове значення елементу: ");
        int newValue = scanner.nextInt();

        array[index] = newValue;

        System.out.println("Оновлений масив: " + Arrays.toString(array));

        scanner.close();
    }
}