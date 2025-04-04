package Lab7.task3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setBrand("Nissan");
        car1.setModel("Note");
        car1.setSpeed(60);

        car1.accelerate(25);
        car1.brake(10);

        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Speed: " + car1.getSpeed());
    }
}
