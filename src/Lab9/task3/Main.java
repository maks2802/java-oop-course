package Lab9.task3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        Shape[] shapes = new Shape[3];

        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = triangle;

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
