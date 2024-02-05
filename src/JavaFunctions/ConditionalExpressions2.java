package JavaFunctions;

public class ConditionalExpressions2 {
    public static void main(String[] args) {
        int num1=1;
        int num2=99;
       int max;
       max = (num1>num2)? num1:num2;
       System.out.println("The max between "+num1+" and "+num2+" is "+max);
       System.out.println((num1 % 2 ==0)? "num is even":"num is odd");
    }
}
