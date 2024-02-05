package ObjectOrientedProgramming;

public class TestCircleWithThis {
    public static void main(String[] args) {
        CircleWithThis c1 = new CircleWithThis(5);
        System.out.println(c1.toString());

        CircleWithThis c2 = new CircleWithThis(99);
        System.out.println(c2);
    }
}
