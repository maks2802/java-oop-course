package Lab5.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть початкову суму вкладу: ");
        double principal = scanner.nextDouble();

        System.out.print("Введіть місячний платіж: ");
        double monthlyDeposit = scanner.nextDouble();

        System.out.print("Введіть річну процентну ставку: ");
        double annualRate = scanner.nextDouble() / 100;

        System.out.print("Введіть кількість років вкладу: ");
        int years = scanner.nextInt();

        System.out.print("Введіть кількість нарахувань відсотків на рік: ");
        int timesCompounded = scanner.nextInt();

        int totalMonth = years * 12;
        double balance = principal;

        for (int i = 0; i < totalMonth; i++) {
            balance += monthlyDeposit;
            balance *= Math.pow(1 + annualRate / timesCompounded, 1.0 * timesCompounded / 12 );
        }

        System.out.printf("The amount after %d years is: %.2f", years, balance);

        scanner.close();
    }
}
