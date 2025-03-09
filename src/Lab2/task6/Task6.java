package Lab2.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        double num = scanner.nextDouble();

        double sqrt = Math.sqrt(num);
        long round = Math.round(num);
        double square = Math.pow(num, 2);
        double sinOfNum = Math.sin(num);

        System.out.println("Квадратний корінь: " + sqrt);
        System.out.println("Округлене значення: " + round);
        System.out.println("Піднесене до квадрату: " + square);
        System.out.println("Синус числа: " + sinOfNum);

        scanner.close();
    }
}
