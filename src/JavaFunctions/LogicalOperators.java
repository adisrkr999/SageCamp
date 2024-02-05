package JavaFunctions;

public class LogicalOperators {
    public static void main(String[] args) {
        int number = 11;
        if (number %2 ==0 && number%3 ==0)
            System.out.println(number + " is completely divisible by 2 and 3");
        else if (number %2 ==0 || number%3 ==0)
            System.out.println(number + " is completely divisible by 2 or 3");
        else if (number%2 !=0 && number%3 != 0)
            System.out.println(number+" has a remainder while dividing by 2 and 3");




    }
}
