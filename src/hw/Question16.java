package hw;

public class Question16 {
    public static void main(String[] args) {
        double xCord = Math.floor(Math.random()*(50-(-50)+1)+(-50));
        double yCord = Math.floor(Math.random()*(100-(-100)+1)+(-100));
        int x = (int)xCord;
        int y = (int)yCord;
        System.out.println(x+","+y);
    }
}
