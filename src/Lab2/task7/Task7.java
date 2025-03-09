package Lab2.task7;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введіть мінімальне число: ");
        int min = scanner.nextInt();
        System.out.print("Введіть максимальне число: ");
        int max = scanner.nextInt();

        int randomNum = random.nextInt(max - min) + min;

        String text = randomNum % 2 == 0 ? "є парним" : "є непарним";

        System.out.printf("Згенероване число: %d\nЧисло: %d є %s\n", randomNum, randomNum, text);

        scanner.close();
    }
}
