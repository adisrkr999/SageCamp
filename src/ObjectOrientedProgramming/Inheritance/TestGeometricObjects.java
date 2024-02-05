package ObjectOrientedProgramming.Inheritance;

public class TestGeometricObjects {
    public static void main(String[] args) {
        Circle c1 = new Circle(5,"red",true);
        c1.setColor("purple");
        System.out.println(c1);
        /*System.out.println(c1.getColor());
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        c1.printCircle();*/
    }
}
