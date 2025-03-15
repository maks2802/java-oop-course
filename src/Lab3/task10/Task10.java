package Lab3.task10;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Введіть " + i + " елемент масиву: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Введений масив: " + Arrays.toString(array));

        boolean hasDuplicates = false;
        System.out.println("Знайдено дублікати:");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    hasDuplicates = true;
                    break;
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("Дублікатів немає");
        }

        scanner.close();
    }
}