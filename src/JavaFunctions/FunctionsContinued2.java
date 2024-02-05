package JavaFunctions;

public class FunctionsContinued2 {
    public static int getSum(int startingNum,int endingNum){
        int sum =0;
        for(int num =startingNum;num<=endingNum;num++){
            sum = sum +num;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Hey the sum  of numbers from 1 to 10 is "+getSum(1,10));
        System.out.println("Hey the sum  of numbers from 20 to 39 is "+getSum(20,39));
        System.out.println("Hey the sum  of numbers from 30 to 50 is "+getSum(30,50));
        System.out.println("Hey the sum  of numbers from 11 to 101 is "+getSum(11,101));
        System.out.println("Hey the sum  of numbers from 201 to 391 is "+getSum(201,391));
        System.out.println("Hey the sum  of numbers from 301 to 501 is "+getSum(301,501));
    }
}
