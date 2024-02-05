public class FourthDay {
    public static void main(String[] args) {
        //With the help of 3rd variable
        double a = 10;
        double b = 2;
        System.out.println("Before swapping their original value was:"+"a: "+a+" b: "+b);

        double c ;
        //main logic
        c=a;
        a=b;
        b=c;

        System.out.println("After swapping: "+"a: "+a+" b: "+b);

        //Without
        double first,second;
        first = 2; second = 10;
        System.out.println("Before Swapping");
        System.out.println("first = "+first+" second = "+second);

        first = first -second;
        second = first + second;
        first = second - first;

        System.out.println("After Swapping");
        System.out.println("first = "+first+" second = "+second);


        System.out.println("##########################################################################################");

        // to check whether a number a positive or negative

        double number = -9;

        if (number > 0){
            System.out.println(number+" is positive");
        }
        else if (number == 0) {
            System.out.println(number+" is zero");
        }
        else{
            System.out.println(number+" is negative");
        }
































    }
}
