package JavaFunctions;

public class Functions {
    public static int doSum(int a,int b){
        //logic
        int sum = a+b;
        //System.out.println("Sum is "+sum);
        return sum;


    }
    public static void main(String[] args) {
       int acquiredSum = doSum(22,33);

       int finalSum = acquiredSum+200;
       System.out.println(finalSum);




    }

    }

