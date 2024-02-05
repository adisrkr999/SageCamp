package JavaFunctions;

public class Constants {
    public  final double pi = 3.14;
    public  void calculateAreaOfCircle(double radius){
        System.out.println(pi*radius*radius);
    }

    public static void main(String[] args) {
        Constants c = new Constants();
        c.calculateAreaOfCircle(2);
    }
}
