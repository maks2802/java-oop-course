package Lab7.task3;

public class Car {
    private String brand;
    private String model;
    private int speed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            System.out.println("Error! Швидкість не може бути від'ємною");
        }
    }

    public void accelerate(int value) {
        speed += value;
    }

    public void brake(int value) {
        if (value <= speed) {
            speed -= value;
        } else {
            System.out.println("Error! Швидкість не може бути від'ємною");
        }
    }
}
