package Lab4.task5;

import java.util.Scanner;

public class Task5 {
    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть радіус кола: ");
        double radius = scanner.nextDouble();

        System.out.println("Площа кола = " + calculateArea(radius));

        System.out.print("Введіть довжину прямокутника: ");
        double length = scanner.nextDouble();
        System.out.print("Введіть ширину прямокутника: ");
        double width = scanner.nextDouble();

        System.out.println("Площа прямокутника = " + calculateArea(length, width));

        scanner.close();
    }
}
