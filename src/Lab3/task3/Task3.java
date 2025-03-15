package Lab3.task3;

public class Task3 {
    public static void main(String[] args) {
        int num = 7;

        System.out.println("Цикл for:");
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " помножене на " + i + " дорівнює: " + result);
        }

        System.out.println("\nЦикл while:");
        int i = 1;
        while (i <= 10) {
            int result = num * i;
            System.out.println(num + " помножене на " + i + " дорівнює: " + result);
            i++;
        }

        System.out.println("\nЦикл do-while:");
        int index = 1;
        do {
            int result = num * index;
            System.out.println(num + " помножене на " + index + " дорівнює: " + result);
            index++;
        } while (index <= 10);
    }
}
