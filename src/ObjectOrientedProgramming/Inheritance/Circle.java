package ObjectOrientedProgramming.Inheritance;

public class Circle extends SimpleGeometricObject{
    private double radius;
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public void printCircle(){
        System.out.println("the circle is created on "+getDateCreated()+" and the radius is "+radius);
    }
    public String toString(){
        return super.toString() +" \nradius is : "+radius;
    }
























}
