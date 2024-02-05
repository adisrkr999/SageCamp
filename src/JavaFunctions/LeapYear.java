package JavaFunctions;

public class LeapYear {
    public static void main(String[] args) {
        int year = 1997;
        boolean check = (year%4 == 0 && year % 100 !=0)||(year%400 ==0);
        if (check){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println("Not a leap year");

        }

    }
}
