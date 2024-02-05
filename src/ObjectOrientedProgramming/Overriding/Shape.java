package ObjectOrientedProgramming.Overriding;

public class Shape {
    void draw(){
        System.out.println("drawing a shape!!");
    }
}
class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("drawing a rectangle");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a Circle");
    }
}
class Triangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a Triangle");
    }
}
