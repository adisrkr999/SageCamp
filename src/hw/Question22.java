package hw;

public class Question22 {

    public static void getCircle(int x, int y){
        double distance = Math.sqrt(Math.pow((0-x),2)+Math.pow((0-y),2));
         System.out.println(Math.rint(2.5));
        if (distance<=10){
            System.out.println("the point is inside the circle");
        }
        else {
            System.out.println("the point is outside the circle");
        }
    }
    public static void main(String[] args) {
        getCircle(9,9);
    }
}
