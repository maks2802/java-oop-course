package Lab5.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum;
        double secondNum;
        String operation;
        double result = 0;

        System.out.print("Введіть перше число: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Error! Введіть числове значення");
            System.out.print("Введіть перше число: ");
            scanner.nextLine();
        }
        firstNum = scanner.nextDouble();

        System.out.print("Введіть операцію (+, -, *, /, ^): ");
        operation = scanner.next();
        while (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/") && !operation.equals("^")) {
            System.out.print("Error! Введіть існуючу математичну операцію: ");
            operation = scanner.next();
        }

        System.out.print("Введіть друге число: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Error! Введіть числове значення");
            System.out.print("Введіть друге число: ");
            scanner.nextLine();
        }
        secondNum = scanner.nextDouble();

        switch (operation) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                if (secondNum == 0) {
                    System.out.println("Error! Не можна ділити на 0");
                    scanner.close();
                    return;
                }
                result = firstNum / secondNum;
                break;
            case "^":
                result = Math.pow(firstNum, secondNum);
                break;
        }

        System.out.println("Результат: " + result);

        scanner.close();
    }
}
