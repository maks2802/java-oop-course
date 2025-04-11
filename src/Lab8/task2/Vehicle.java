package Lab8.task2;

public class Vehicle {
    protected int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    void showSpeed() {
        System.out.println("Поточна швидкість: " + this.speed);
    }
}