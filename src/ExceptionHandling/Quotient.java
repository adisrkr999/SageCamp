package ExceptionHandling;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(number1+" / "+number2 + " is "+ (number1/number2));
        int a = 111;
        System.out.println(a);
    }
}
