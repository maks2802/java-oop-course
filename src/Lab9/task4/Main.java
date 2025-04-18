package Lab9.task4;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(5, 9);

        Shape[] shapes = new Shape[2];
        shapes[0] = circle;
        shapes[1] = rectangle;

        System.out.println(shape1.area());

        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
    }
}
