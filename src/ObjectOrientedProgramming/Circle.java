package ObjectOrientedProgramming;

public class Circle {
    double radius = 1;

    double X=1;
    double Y=5;
    Circle(){

    }
    Circle(double newX,double newY){
        X= newX;
        Y= newY;
    }

    Circle(double newRadius){
        radius = newRadius;
    }

    double getArea(){
        return radius*radius*Math.PI;
    }

    double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
