package ObjectOrientedProgramming.Polymorphism;

public abstract class Shape {
    abstract void  draw();
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
