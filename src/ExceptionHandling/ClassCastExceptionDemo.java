package ExceptionHandling;

public class ClassCastExceptionDemo {
    public static void main(String[] args) {
        try{
            double num1 = 9;
            int num2=(int) num1;
            System.out.println(num2);
            Object int1 = 9;
            String stringValue = int1.toString();
            System.out.println(stringValue);


            Object obj = "9";
            Integer number = (Integer) obj;
            System.out.println(number);
        }catch(ClassCastException ex){
            ex.printStackTrace();
            //System.out.println("exception caught");
        }
    }
}
