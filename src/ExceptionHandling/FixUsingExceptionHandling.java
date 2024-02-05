package ExceptionHandling;

import java.util.Scanner;

public class FixUsingExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        try{
            int result = quotient(number1,number2);
            System.out.println(number1+" / "+number2 + " is "+ result);
        }catch(ArithmeticException ex){
            System.out.println("Exception is caught...no need to worry");
        }
        //normal execution of program continues if exception is handled
        int a = 10;
        System.out.println(a);
    }

    private static int quotient(int number1, int number2) {
       /* if(number2 == 0){
            throw new ArithmeticException("cant divide by zero");
        }*/
        return number1/number2;
    }
}
