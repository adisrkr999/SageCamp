public class ArrayAndArmstrongNumbers {

    public static void main(String[] args) {
        int[] numbers = {11,222,153,888,999 ,371,101};
        for (int number : numbers){

            int originalNumber = number;
            int remainder;
            double sum =0;

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

}
