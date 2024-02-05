package hw;

public class Question18 {
    public static void shippingCost(int weight){
        if(weight<=1){
            System.out.println("the shipping cost is 3.5");
        }
        else if(weight<=3){
            System.out.println("the shipping cost is 5.5");
        }
        else if(weight<=10){
            System.out.println("the shipping cost is 8.5");
        }
        else if(weight<=20){
            System.out.println("the shipping cost is 10.5");
        }
        else {
            System.out.println("the package cannot be shipped.");
        }
    }
    public static void main(String[] args) {
        shippingCost(3);
    }
}
