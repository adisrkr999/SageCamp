package hw;

public class Question1 {
    public static void solveQuadraticEquation(double a, double b, double c){
        double descriminant = Math.pow(b,2)-(4*a*c);
        double root1 = ((-1*b)+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        double root2 = ((-1*b)-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        if (descriminant==0){
            System.out.println("The solution is "+root1);
        }
        else if (descriminant>0) {
            System.out.println("The solutions are "+root1+" and " + root2);
        }
        else {
            System.out.println("The equation has no real roots.");
        }

    }
    public static void main(String[] args) {
        solveQuadraticEquation(1,2,3);
    }
}
