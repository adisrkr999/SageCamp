package ObjectOrientedProgramming.Overriding;

public class TestOverriding {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle ;
        rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        shape.draw();
        circle.draw();
        rectangle.draw();
        triangle.draw();

    }
}
