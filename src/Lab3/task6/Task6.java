package Lab3.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введіть " + i + " елемент масиву: ");
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        int max = array[0];
        int sum = 0;
        int evenNumber = 0;

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }

            sum += num;

            if (num % 2 == 0) {
                evenNumber++;
            }
        }

        double averageNum = (double) sum / n;

        System.out.println("Мінімальний елемент масиву: " + min);
        System.out.println("Максимальний елемент масиву: " + max);
        System.out.println("Середнє значення елементів у масиві: " + averageNum);
        System.out.println("Кількість парних чисел у масиві: " + evenNumber);

        scanner.close();
    }
}