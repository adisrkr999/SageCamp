package ExceptionHandling;

public class ChainedExceptionsDemo {
    public static void main(String[] args) {
        try{
            method1();
        }catch (Exception ex){
            ex.printStackTrace();
           // System.out.println("exception handled");
        }
    }

    private static void method1() throws Exception {
        try{
            method2();
        }catch(Exception ex){
            throw new Exception("exception from method 1",ex);
        }
    }

    private static void method2() throws Exception {
        throw new Exception("Exception from method2");
    }
}
