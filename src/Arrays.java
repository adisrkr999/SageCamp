public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        numbers[0] = 2;
        numbers[3] = 10;

//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);


        System.out.println(numbers.length);

        for(int index = 0; index<numbers.length;index++){
            System.out.println(numbers[index]);

        }

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        //obtain values from array
        int[] numbers1 = new int[4];
        numbers1[0] =1;
        numbers1[2] = 2;
        numbers1[3] = 6;
        int valueAtIndex0 = numbers1[0];
        int valueAtIndex2 = numbers1[2];

        int summation = valueAtIndex0+valueAtIndex2;
        System.out.println(summation);



        //out of bounds error
        //int valueAtIndex4 = numbers1[4];
        //numbers1[4] = 99;
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        int[] numbers2 = {1,2,3,4,5,6,0,0,8}; //Array Literal //1st way

        for(int index = 0; index<numbers2.length;index++)
            {System.out.println(numbers2[index]);

        }
        int[] numbers3;  //2nd way
        numbers3 = new int[5];

        int[] numbers4 = new int[5]; //3rd way

        int[] numbers5 = new int[]{1,33,55,66,6};//4th way

        int[] numbers6;
        //doing some logic
        //dddfd
        ///ddd
        numbers6 =new int[] {1,2,3,4,5,6,0,0,8};
        //numbers6=new int[]{1,33,55,66,6};



        System.out.println(numbers5);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");


        for(int each_num :numbers5){
            System.out.println(each_num);
        }











    }
}
