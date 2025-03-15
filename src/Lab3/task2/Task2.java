package Lab3.task2;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int inputNum;

        System.out.println("Введіть мінімальне число: ");
        int min = scanner.nextInt();
        System.out.println("Введіть максимальне число: ");
        int max = scanner.nextInt();

        int randomNum = random.nextInt(min, max);

        System.out.printf("Вгадайте число у проміжку від %d до %d\n", min, max);

        do {
            System.out.println("Введіть число: ");
            inputNum = scanner.nextInt();

            if (inputNum < randomNum) {
                System.out.println("Спробуйте більше число");
            } else if (inputNum > randomNum) {
                System.out.println("Спробуйте менше число");
            } else {
                System.out.println("Ви вгадали!");
            }
        } while (inputNum != randomNum);

        scanner.close();
    }
}
