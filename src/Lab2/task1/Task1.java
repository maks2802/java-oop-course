package Lab2.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Число є додатним");
        } else if (num == 0) {
            System.out.println("Число дорівнює 0");
        } else {
            System.out.println("Число є від'ємним");
        }

        scanner.close();
    }
}
