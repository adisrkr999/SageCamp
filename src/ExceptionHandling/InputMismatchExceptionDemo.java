package ExceptionHandling;

import java.util.Scanner;
import java.util.InputMismatchException;
public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;
        while(continueInput){
            try{
                System.out.println("Enter an integer : ");
                int num = scanner.nextInt();

                System.out.println(("The number entered is "+ num));
                continueInput = false;

            }
            catch (InputMismatchException ex){
                System.out.println("Plz entr an integer value...and retry");
                scanner.nextLine();
            }
        }
    }
}
