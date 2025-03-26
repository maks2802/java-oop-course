package Lab5.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0;
        int choice;

        do {
            System.out.println("1. Вивести поточний баланс");
            System.out.println("2. Внести кошти на рахунок");
            System.out.println("3. Зняти кошти з рахунку");
            System.out.println("4. Завершити роботу програми");
            System.out.println("Оберіть бажану дію (1-4): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error! Введіть числове значення");
                System.out.println("Оберіть бажану дію (1-4): ");
                scanner.nextLine();
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance = deposit(scanner, balance);
                    break;
                case 3:
                    balance = withdraw(scanner, balance);
                    break;
                case 4:
                    System.out.println("Вихід з програми");
                    break;
                default:
                    System.out.println("Невірний вибір. Оберіть від 1 до 4");
            }
        } while (choice != 4);

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("Поточний баланс: " + balance);
    }

    static double deposit(Scanner scanner, double balance) {
        System.out.print("Внести суму: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.printf("Внесено: %.2f Поточний баланс: %.2f\n", amount, balance);
        } else {
            System.out.println("Сума повинна бути позитивною");
        }

        return balance;
    }

    static double withdraw(Scanner scanner, double balance) {

        System.out.print("Зняти суму: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Знято: %.2f Поточний баланс: %.2f\n", amount, balance);
        } else if (amount > balance) {
            System.out.println("Недостатньо коштів");
        } else {
            System.out.println("Сума повинна бути позитивною");
        }

        return balance;
    }
}
