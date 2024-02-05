public class LoopingExamples {
    public static void main(String[] args) {
        //prime numbers
        int givenNum = 1;

        if (givenNum ==1){
            System.out.println("1 is neither prime nor composite");
        }
        else {


            String flag = "prime";
            for (int checkingNum = 2; checkingNum < givenNum; checkingNum = checkingNum + 1) {
                if (givenNum % checkingNum == 0) {
                    flag = "not prime";
                    break;

                }

            }

            if (flag == "prime") {
                System.out.println(givenNum + " is prime");
            } else if (flag == "not prime") {
                System.out.println(givenNum + " is not prime");

            }


        }
    }
}
