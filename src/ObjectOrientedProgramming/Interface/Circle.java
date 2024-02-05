package ObjectOrientedProgramming.Interface;

public class Circle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void color() {
        System.out.println("Coloring the circle");
    }
}
