package ObjectOrientedProgramming;

public class CircleWithPrivateDataFields {
    private double radius = 1;
    private static int numberOfObjectsCreated = 0;
    public CircleWithPrivateDataFields(){
        numberOfObjectsCreated++;
    }
    public CircleWithPrivateDataFields(double radius){
        this.radius = radius;
        numberOfObjectsCreated++;
    }
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getNumberOfObjects(){
        return numberOfObjectsCreated;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
