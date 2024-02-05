package ExceptionHandling;

public class ArrayIndexOutOfboundsExceptionDemo {
    public static void main(String[] args) {
        try{
            int[] x = {22,33,44,55};
            System.out.println(x[7]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.toString());
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
