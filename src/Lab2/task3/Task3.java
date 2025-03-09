package Lab2.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть 2 числа: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int max = num1 > num2 ? num1 : num2;
        System.out.println("Максимальне число: " + max);

        scanner.close();
    }
}
