package ObjectOrientedProgramming.AbstractClass;

public class TestCircle {
    public static void main(String[] args) {
        GeometricObject geometricObject = new Circle(5,"blue",true);
        System.out.println(geometricObject);
        System.out.println(geometricObject.getArea());
        System.out.println(geometricObject.getPerimeter());
        System.out.println(geometricObject.getColor());
        System.out.println(geometricObject.isFilled());

    }

}
