package Lab8.task2;

public class Car extends Vehicle{
    public Car(int speed) {
        super(speed);
    }

    void accelerate() {
        speed += 10;
    }
}
