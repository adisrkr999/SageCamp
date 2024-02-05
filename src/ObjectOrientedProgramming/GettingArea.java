package ObjectOrientedProgramming;

import java.util.Scanner;

public class GettingArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bird sparrow = new Bird();

        String output = sparrow.fly();
        System.out.println(output);

        System.out.println("Enter the radius");
        double radius = scanner.nextDouble();
        System.out.println("area = "+(Math.PI *radius*radius));

    }
}
