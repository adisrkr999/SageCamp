public class LoopingExamples2 {
    public static void main(String[] args) {
       int number=240;
       int count =0;

       number=number/10;
       count = count+1;
       System.out.println(number);
//2nd time
        number=number/10;
        count = count+1;
        System.out.println(number);
//3rd time
        number=number/10;
        count = count+1;
        System.out.println(number);

        System.out.println("The number of digits in the given number is "+count);

        /////////////////////////////////////////////////////////////////

        System.out.println("#############################################################");
        int num=24022222;
        int counter =0;
        while (num != 0){
            num = num/10;
            counter=counter+1;

        }
        System.out.println(counter);

///////////////////////////////////////////////////////////////////////////////////////
System.out.println("#############################################################");
//////////////////////////////////////////////////////////////////////////////////////

        int num1 =11;
        int copy = num1;
        int reversedNumber = 0;

        while (num1 != 0){
            int digit = num1 % 10;
            reversedNumber=reversedNumber *10 + digit;


            num1 = num1 /10;


        }

        System.out.println("The reverse of the number is "+reversedNumber);

        if (reversedNumber == copy)
            System.out.println(copy+" is a palindrome");
        else
            System.out.println(copy+" isn't a palindrome");





    }
}
