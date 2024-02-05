public class ArraysContinued {
    public static void main(String[] args) {
        int originalNumber = 153;
        int remainder;
        double sum =0;
        int number = originalNumber;
        while(number!=0){
            remainder = number % 10;
            sum = sum + Math.pow(remainder,3);
            number = number/10;

        }

        //check whether number is armstrong or not
        if(sum == originalNumber)
            System.out.println(originalNumber+" is an Armstrong number");
        else
            System.out.println(originalNumber+" is not an Armstrong number");




    }
}
