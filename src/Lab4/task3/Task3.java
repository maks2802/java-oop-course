package Lab4.task3;

import java.util.Scanner;

public class Task3 {
    static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть число b: ");
        int b = scanner.nextInt();

        int result = multiply(a, b);

        System.out.println("Добуток двох чисел: " + result);

        scanner.close();
    }
}
