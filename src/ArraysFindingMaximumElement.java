public class ArraysFindingMaximumElement {


    public static void main(String[] args) {
        double[] NUMBERS = {-11, -1,8};
        double max = NUMBERS[0];
        for(double each_number: NUMBERS){
            if (each_number> max)
                max=each_number;
        }
        System.out.println("The largest number is "+max);
        //----------------------------------------------------------
        double max1=NUMBERS[0];
        for(int index = 0; index< NUMBERS.length; index++){
            if(NUMBERS[index]>max1)
                max1 = NUMBERS[index];
        }
        System.out.println(max1);

    }
}
