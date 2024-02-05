package ObjectOrientedProgramming.Interface;

public interface Drawable {
    void draw();
    void color();

    default void describeInterface(){
        System.out.println("This is an interface describing the different ideas that can be applied to a shape ");
    }
    static double findVolume(double l){
        return l*l*l;
    }
    static double findVolume(double l,double b, double h){
        return l*h*b;
    }

}
