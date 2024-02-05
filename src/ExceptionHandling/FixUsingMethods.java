package ExceptionHandling;

import java.util.Scanner;

public class FixUsingMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = quotient(number1,number2);
        System.out.println(number1+" / "+number2 + " is "+ result);
        int a = 10;
        System.out.println(a);
    }

    private static int quotient(int number1, int number2) {
        if(number2 ==0){
            System.out.println("Cant divide by zero");
            System.exit(1);
        }
        return number1/number2;
    }
}
