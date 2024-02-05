package hw;

public class Question12 {
    public static void palindrome(int number){
        int copy = number;
        int reverseNum = 0;

        while (number != 0){
            int digit = number %10;
            reverseNum = reverseNum*10 + digit;
            number=number/10;
        }

        if (copy == reverseNum){
            System.out.println(copy+" is a palindrome");
        }
        else {
            System.out.println(copy + " is not a palindrome");
        }
    }
    public static void main(String[] args) {
        palindrome(121);
    }
}
