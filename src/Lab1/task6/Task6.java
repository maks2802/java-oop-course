package Lab1.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        int width = scanner.nextInt();

        System.out.print("Enter height: ");
        int height = scanner.nextInt();

        System.out.println("Area of rectangle: " + (width * height));

        scanner.close();
    }
}
