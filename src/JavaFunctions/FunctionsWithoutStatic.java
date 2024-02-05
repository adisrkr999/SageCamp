package JavaFunctions;

public class FunctionsWithoutStatic {
    public static void main(String[] args) {
        FunctionsWithoutStatic obj = new FunctionsWithoutStatic();
        int acquiredSum = obj.doSum(22,33);
        int acquiredProduct = obj.doMultiply(22,33);
        System.out.println(acquiredSum+"...product.."+acquiredProduct);
    }
    public int doSum(int num1,int num2){
        int sum = num1+num2;
        return sum;
    }
    public int doMultiply(int num1,int num2){
        int product = num1*num2;
        return product;
    }

}
