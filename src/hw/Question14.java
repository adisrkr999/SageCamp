package hw;

public class Question14 {
    public static void coinFlip(String coinGuess){
        double num = Math.floor(Math.random()*(1-0+1)+0);
        String coin;
        if (num==0)
            coin = "heads";
        else
            coin = "tails";

        if (coinGuess==coin)
            System.out.println("you are correct! the coin is "+coin);
        else
            System.out.println("you are wrong! the coin is "+coin);
    }
    public static void main(String[] args) {
        coinFlip("heads");
    }
}
