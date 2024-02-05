package ObjectOrientedProgramming.MethodOverloading;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(22,11));
        System.out.println(c1.add(11,22,33));
        System.out.println(c1.add(1.2,2.2));
        System.out.println(c1.multiply(2,3));
        System.out.println(c1.multiply(2,3.2));
    }
}
