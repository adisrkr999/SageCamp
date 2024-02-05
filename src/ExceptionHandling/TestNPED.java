package ExceptionHandling;

public class TestNPED {
    public static void main(String[] args) {
        NullPointerExceptionDemo obj = new NullPointerExceptionDemo();


        //obj.name = "David";

        try {
            if (obj.name.equals("David")) {
                System.out.println("the name matches");
            }
        }
        catch(NullPointerException ex){
            System.out.println("Exception caught!");
            obj.name = "somename";
        }
        System.out.println(obj.name);
    }
}
