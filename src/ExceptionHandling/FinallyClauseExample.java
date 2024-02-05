package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyClauseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;
        String document = "contains important data";
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
            finally{
                System.out.println("inside finally block!");
                System.out.println(document);
            }

        }
    }
}
