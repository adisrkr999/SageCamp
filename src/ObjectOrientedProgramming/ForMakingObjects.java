package ObjectOrientedProgramming;

public class ForMakingObjects {
    public static void main(String[] args) {
        Bird sparrow = new Bird();
        System.out.println(sparrow.eyes);
        String output = sparrow.fly();

        Bird.jump();
    }
}
