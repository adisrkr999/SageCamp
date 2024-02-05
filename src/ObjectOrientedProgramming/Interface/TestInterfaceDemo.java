package ObjectOrientedProgramming.Interface;

public class TestInterfaceDemo {
    public static void main(String[] args) {
        Drawable d;
                 d=new Rectangle();
        d.draw();
        d.color();
        d.describeInterface();
                 d =new Circle();
        d.draw();
        d.color();
        d.describeInterface();
        double volume =Drawable.findVolume(5.5);
        System.out.println("The volume of the cube is "+volume);

        volume =Drawable.findVolume(5.5,2,3.3);
        System.out.println("The volume of the cuboid is "+volume);

    }
}
