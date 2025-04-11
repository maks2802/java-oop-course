package Lab8.task1;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Max", 99, 100000);

        System.out.println(employee1.getName());
        employee1.setName("Vlad");
        System.out.println(employee1.getName());

        System.out.println(employee1.getAge());
        employee1.setAge(190);
        System.out.println(employee1.getAge());
    }
}
