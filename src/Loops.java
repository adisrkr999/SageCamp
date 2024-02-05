public class Loops {
    public static void main(String[] args) {
//
//        int number = 10;
//        number = number +1;
//
//        System.out.println(number<10);


        //while loops

        int num =1;
        while(num<10) {
            System.out.println(num);
            num = num + 1;

        }
System.out.println("####################");

      //break statements
        int num1 = 1;
        while (num1<10){


            if (num1 == 3){
                break;
            }
            System.out.println(num1);
            num1 = num1 + 1;
        }

        System.out.println("#######################################");

        int num2 = 1;
        while (num2<10){

            System.out.println(num2);
            if (num2 == 3){
                break;
            }

            num2 = num2 + 1;
        }
System.out.println("#######################################");

        int num5 = 0;
        while (num5 <10){
            num5= num5+1;
            if (num5 == 4){
                continue;
            }
            System.out.println(num5);
        }

        System.out.println("#############");
        //bad practise
        int num3=0;
        while(num3<10){
            System.out.println(num3);
            num3 = num3+1;
            if (num3 == 4){
                continue;
            }
        }
        System.out.println("#############");
        //worst practise
        int num4 = 0;
        while(num4 <10){
            System.out.println("hey i am looping");
            if(num4 ==4){
                continue;
            }
            System.out.println(num4);
            num4 = num4+1;
        }


















    }
}
