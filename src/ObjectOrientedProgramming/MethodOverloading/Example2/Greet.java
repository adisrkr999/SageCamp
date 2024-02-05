package ObjectOrientedProgramming.MethodOverloading.Example2;

public class Greet {
    public static void greet(String name){
        System.out.println("Hello "+name+" !");
    }

    public static void greet(String firstName, String lastName){
        System.out.println("Hello "+firstName+" "+lastName+" !");
    }
}
