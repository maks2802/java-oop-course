package Lab5.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "Скільки материків на планеті?",
                "Коли Україна стала незалежною державою?",
                "Назвіть столицю Іспанії",
                "З якою із перелічених держав Україна НЕ має кордону?",
                "Який з цих регіонів України є найменшим за площею?"};

        String[][] answers = {
                {"1. П'ять", "2. Шість", "3. Сім", "4. Вісім"},
                {"1. 1989", "2. 1990", "3. 1991", "4. 1996"},
                {"1. Барселона", "2. Андора", "3. Мадрид", "4. Севілья"},
                {"1. Угорщина", "2. Словенія", "3. Словаччина", "4. Румунія"},
                {"1. Дніпропетровська область", "2. Чернігівська область", "3. АР Крим", "4. Чернівецька область"}
        };
        int[] rightAnswers = {2, 3, 3, 2, 4};
        int totalRightAnswers = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String answer : answers[i]) {
                System.out.println(answer);
            }

            int answer;
            System.out.print("Введіть номер правильної відповіді: ");
            while (true) {
                if (scanner.hasNextInt()) {
                    answer = scanner.nextInt();
                    if (answer >= 1 && answer <= 4) {
                        break;
                    } else {
                        System.out.println("Введіть варіант від 1 до 4");
                    }
                } else {
                    System.out.println("Введіть числове значення");
                    scanner.next();
                }
            }

            if (answer == rightAnswers[i]) {
                System.out.println("Правильна відповідь!");
                totalRightAnswers++;
            } else {
                System.out.println("Невірна відповідь");
            }
        }

        System.out.printf("Правильних відповідей: %d/%d\n", totalRightAnswers, questions.length);

        scanner.close();
    }
}
