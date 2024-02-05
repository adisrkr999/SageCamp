package ObjectOrientedProgramming.Interface;

public class Rectangle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public void color() {
        System.out.println("Coloring the rectangle");
    }
}
