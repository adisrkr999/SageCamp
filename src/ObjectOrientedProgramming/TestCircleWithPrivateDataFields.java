package ObjectOrientedProgramming;

public class TestCircleWithPrivateDataFields {
    public static void main(String[] args) {
        CircleWithPrivateDataFields c =
                new CircleWithPrivateDataFields(5);
        System.out.println("The area of the circle with radius as "+
                c.getRadius() + " is : "+c.getArea());
        c.setRadius(7);
        System.out.println("The area of the circle with radius as "+
                c.getRadius() + " is : "+c.getArea());
        System.out.println("The number of objects created are : "+CircleWithPrivateDataFields.getNumberOfObjects());

        CircleWithPrivateDataFields c2 =
                new CircleWithPrivateDataFields(5);
        System.out.println("The number of objects created are : "+CircleWithPrivateDataFields.getNumberOfObjects());
    }
}
