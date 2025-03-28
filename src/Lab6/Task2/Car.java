package Lab6.Task2;

public class Car {
    String mark;
    String model;
    int speed;

    public void showInfo(int increment) {
        speed += increment;
        System.out.println("Марка: " + mark + "\nМодель: " + model + "\nШвидкість: " + speed);
    }
}
