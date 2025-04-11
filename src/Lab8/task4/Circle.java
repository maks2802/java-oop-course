package Lab8.task4;

public class Circle extends Shape{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}
