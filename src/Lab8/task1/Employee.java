package Lab8.task1;

public class Employee extends Person{
    int salary;

    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }
}
