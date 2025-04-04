package Lab6.task2;

public class CarModel {
    public static void main(String[] args) {
        model(100);
    }

    public static void model(int increment) {
        String mark = "Nissan";
        String model = "Note";
        int speed = 60;

        speed += increment;

        System.out.println("Марка: " + mark + "\nМодель: " + model + "\nШвидкість: " + speed);
    }
}
