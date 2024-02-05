package JavaFunctions;

public class ConditionalExpressions {
    public static void main(String[] args) {
        int x=-10;
        int y;

        if (x>0)
            y=1;
        else
            y=-1;
        System.out.println("for if else y = "+y);
        //Conditional Expression way
        y = (x>0)?1:-1;
        System.out.println(y);
    }
}
