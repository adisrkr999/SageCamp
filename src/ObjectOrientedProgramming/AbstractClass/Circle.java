package ObjectOrientedProgramming.AbstractClass;

public class Circle extends GeometricObject{

    private double radius;
    public Circle(){

    }
    public Circle(double radius,String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    public double getPerimeter(){
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCircle{" +
                "radius=" + radius +
                '}';
    }
}
