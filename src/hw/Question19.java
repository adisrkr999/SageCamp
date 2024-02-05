package hw;

public class Question19 {
    public static void triangleValid(int sideOne, int sideTwo, int sideThree){
        if ((sideOne+sideTwo)> sideThree) {
            if ((sideTwo + sideThree) > sideOne) {
                if ((sideThree + sideOne) > sideTwo) {
                    System.out.println("this is a valid triangle");
                } else {
                    System.out.println("this is not a valid triangle");
                }
            } else {
                System.out.println("this is not a valid triangle");
            }
        }
        else {
            System.out.println("this is not a valid triangle");
        }
        }
    public static void main(String[] args) {
        triangleValid(5,1,1);
    }
}
