package Lab2.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        String text = scanner.nextLine();

        System.out.println("Довжина рядка: " + text.length());
        System.out.println("Перший символ: " + text.charAt(0));
        System.out.println("Останній символ: " + text.charAt(text.length() - 1));
        System.out.println("Нижній регістр: " + text.toLowerCase());
        System.out.println("Верхній регістр: " + text.toUpperCase());
        System.out.println("Підрядок: " + text.substring(0, 3));
        System.out.println("Чи містить слово \"Java\"? " + (text.indexOf("Java") != -1));

        scanner.close();
    }
}
