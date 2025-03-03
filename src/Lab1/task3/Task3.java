package Lab1.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        byte num1 = scanner.nextByte();
        double num2 = num1 * 20;
        int num3 = (int) num2;
        System.out.print("Final number: " + num3);

        scanner.close();
    }
}
