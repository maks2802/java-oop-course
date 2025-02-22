import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter height (in metres): ");
        double height = scanner.nextDouble();

        System.out.print("Are you a student: ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Student: " + isStudent);

        scanner.close();
    }
}
