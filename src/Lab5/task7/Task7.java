package Lab5.task7;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 100;
        int bet;
        int win;
        String choice = "yes";

        System.out.println("Вітаю у грі слот-машина!");

        do {
            System.out.println("Ваш поточний баланс: " + balance);
            System.out.print("Введіть ставку: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error! Введіть числове значення");
                scanner.nextLine();
            }
            bet = scanner.nextInt();

            scanner.nextLine();

            if (bet <= 0) {
                System.out.println("Введіть коректне число");
                continue;
            }
            if (bet > balance) {
                System.out.println("Недостатньо коштів");
                continue;
            }

            balance -= bet;

            String[] result = spinRow();
            printRow(result);

            win = getPayout(result, bet);
            balance += win;
            if (win > 0) {
                System.out.println("Ви виграли!");
            } else {
                System.out.println("На жаль, ви програли(");
            }

            System.out.println("Ваш поточний баланс: " + balance);

            System.out.println("Хочете продовжити гру (yes/no)?");
            choice = scanner.nextLine().toLowerCase();
            while (!choice.equals("yes") && !choice.equals("no")) {
                System.out.println("Error! Оберіть yes або no");
                System.out.println("Хочете продовжити гру (yes/no)?");
                choice = scanner.nextLine().toLowerCase();
            }
        } while (balance > 0 && choice.equals("yes"));

        if (balance == 0) {
            System.out.println("На жаль, ваш баланс вичерпано. Дякуємо за гру!");
        } else {
            System.out.println("Ваш баланс: " + balance + " Дякуємо за гру!");
        }

        scanner.close();
    }
    static String[] spinRow() {
        Random random = new Random();

        String[] allValues = {"🍒", "🍋", "🍊", "🏆", "⚓"};
        String[] randomValues = new String[3];

        for (int i = 0; i < 3; i++) {
            randomValues[i] = allValues[random.nextInt(allValues.length)];
        }

        return randomValues;
    }

    static void printRow(String[] row) {
        System.out.println("*************");
        System.out.println(row[0] + " | " + row[1] + " | " + row[2]);
        System.out.println("*************");
    }

    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            switch (row[0]) {
                case "🍒":
                    return bet * 3;
                case "🍋":
                    return bet * 4;
                case "🍊":
                    return bet * 5;
                case "🏆":
                    return bet * 10;
                case "⚓":
                    return bet * 50;
                default:
                    return 0;
                    }
        } else if (row[0].equals(row[1]) || row[1].equals(row[2]) || row[0].equals(row[2])) {
            switch (row[0]) {
                case "🍒":
                    return bet * 2;
                case "🍋":
                    return bet * 2;
                case "🍊":
                    return bet * 2;
                case "🏆":
                    return bet * 5;
                case "⚓":
                    return bet * 10;
                default:
                    return 0;
            }
        } else {
            return 0;
        }
    }
}
