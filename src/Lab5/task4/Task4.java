package Lab5.task4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int tryNum;
        int roll;
        int sum = 0;

        System.out.print("Введіть кількість кубиків для кидання: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error! Введіть числове значення");
            scanner.nextLine();
        }

        tryNum = scanner.nextInt();
        if (tryNum <= 0) {
            System.out.println("Error! Введіть число більше 0");
            scanner.nextLine();
            return;
        }

        for (int i = 0; i < tryNum; i++) {
            roll = random.nextInt(1, 7);
            print(roll);
            sum += roll;
        }

        System.out.println("Сума = " + sum);

        scanner.close();
    }
    static void print(int roll) {
        String dice1 = " ----- \n" +
                       "|     |\n" +
                       "|  *  |\n" +
                       "|     |\n" +
                       " ----- ";
        String dice2 = " ----- \n" +
                       "| *   |\n" +
                       "|     |\n" +
                       "|   * |\n" +
                       " ----- ";
        String dice3 = " ----- \n" +
                       "| *   |\n" +
                       "|  *  |\n" +
                       "|   * |\n" +
                       " ----- ";
        String dice4 = " ----- \n" +
                       "| * * |\n" +
                       "|     |\n" +
                       "| * * |\n" +
                       " ----- ";
        String dice5 = " ----- \n" +
                       "| * * |\n" +
                       "|  *  |\n" +
                       "| * * |\n" +
                       " ----- ";
        String dice6 = " ----- \n" +
                       "| * * |\n" +
                       "| * * |\n" +
                       "| * * |\n" +
                       " ----- ";

        switch (roll) {
            case 1:
                System.out.println(dice1);
                break;
            case 2:
                System.out.println(dice2);
                break;
            case 3:
                System.out.println(dice3);
                break;
            case 4:
                System.out.println(dice4);
                break;
            case 5:
                System.out.println(dice5);
                break;
            case 6:
                System.out.println(dice6);
                break;
            default:
                System.out.println("Error! Введіть значення від 1 до 6");
        }
    }
}
