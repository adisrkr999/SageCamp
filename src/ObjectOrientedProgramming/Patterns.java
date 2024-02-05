package ObjectOrientedProgramming;

public class Patterns {
    public static void main(String[] args) {
        patternBox();
        patternTriangle();
    }
    public static void patternTriangle(){
        for(int row = 0 ;row<10;row++){
            for (int col = 1;col<=row+1;col++){
                System.out.print(col+"  ");
            }
            System.out.println();
        }
    }
    public static void patternBox() {
        for(int row = 1;row<=4;row++ ){
            for(int col = 1; col<=4;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
