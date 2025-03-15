package Lab3.task5;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введіть розмір масиву: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(1, 100);
        }

        System.out.println("Отримали масив:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
