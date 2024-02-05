package ObjectOrientedProgramming;

public class TestCircle {
    public static void main(String[] args) {
        System.out.println("&&&&&Constructor no 3 &&&&&&&&");
        Circle c1 = new Circle(5);
        System.out.println(c1.radius);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        c1.setRadius(10);
        System.out.println(c1.radius);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        c1.setRadius(20);
        System.out.println(c1.radius);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        System.out.println("&&&&&Constructor no 2 &&&&&&&&");
        Circle c2 = new Circle(2,2);
        System.out.println(c2.radius);
        System.out.println(c2.X);
        System.out.println(c2.Y);
        System.out.println("&&&&&Constructor no 1 &&&&&&&&");
        Circle c3 = new Circle();
        System.out.println(c3.radius);
        System.out.println(c3.X);
        System.out.println(c3.Y);




    }
}
