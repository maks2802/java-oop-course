package Lab5.task6;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String again = "yes";

        do {
            System.out.println("Оберіть rock, paper або scissors: ");
            String userChoice = scanner.nextLine().toLowerCase();
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Error! Оберіть один з трьох варіантів");
                continue;
            }

            int computerChoiceIndex = random.nextInt(0, 3);
            String computerChoice = "";

            switch (computerChoiceIndex) {
                case 0:
                    computerChoice = "rock";
                    break;
                case 1:
                    computerChoice = "paper";
                    break;
                case 2:
                    computerChoice = "scissors";
                    break;
            }

            System.out.println("Вибір комп'ютера: " + computerChoice);

            if (
                    (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                            (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                            (userChoice.equals("paper") && computerChoice.equals("rock"))
            ) {
                System.out.println("Ви перемогли!");
            } else if (userChoice.equals(computerChoice)) {
                System.out.println("Нічия!");
            } else {
                System.out.println("Ви програли!");
            }

            System.out.println("Хочете зіграти ще один раунд (yes/no)?");
            again = scanner.nextLine().toLowerCase();
            while (!again.equals("yes") && !again.equals("no")) {
                System.out.println("Error! Оберіть yes або no");
                System.out.println("Хочете зіграти ще один раунд (yes/no)?");
                again = scanner.nextLine().toLowerCase();
            }
        } while (again.equals("yes"));

        System.out.println("Thanks for playing!");

        scanner.close();
    }
}
