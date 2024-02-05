public class ForLoops {
    public static void main(String[] args) {

        for(int num = 0; num<10; num=num+1){
            System.out.println(num);

        }

        System.out.println("##############");
        int num1 =0;
        while(num1<10){


            System.out.println(num1);
            num1=num1+1;


        }
        System.out.println("##############");


        for(int num = 0; num<10; num=num+1){
            if (num==2){
                break;
            }
            System.out.println(num);

        }
        System.out.println("##############");

        for(int num = 0; num<10; num=num+1){
            System.out.println(num);
            if (num==2){
                break;
            }


        }











    }
}
