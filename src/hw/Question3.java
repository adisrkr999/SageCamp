package hw;

public class Question3 {

    public static void solveLinearEquation(double a, double b, double c, double d, double e, double f){
        double determinant = a*d-b*c;
        System.out.println(determinant);
        if(determinant==0){
            System.out.println("the equation has no solution.");
        }
        else {
            double x= ((e*d)-(b*f))/determinant;
            double y= ((a*f)-(c*e))/determinant;
            System.out.println("x: "+ x);
            System.out.println("y: "+ y);
        }
    }
    public static void main(String[] args) {
        solveLinearEquation(9.0,-9.0,5.0,-5.0,-6.0,-21.0);

    }
}
