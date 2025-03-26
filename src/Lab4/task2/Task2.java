package Lab4.task2;

import java.util.Scanner;

public class Task2 {
    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть число b: ");
        int b = scanner.nextInt();

        System.out.println("Сума двох чисел: " + sum(a, b));

        scanner.close();
    }
}
