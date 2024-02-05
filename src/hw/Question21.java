package hw;

public class Question21 {
    public static void zellersCongruence(int year, int month, int dayOfMonth){
        if (month==1){
            month=13;
            year=year-1;
        } else if (month==2) {
            month=14;
            year=year-1;
        }
        int dayOfWeek = (dayOfMonth+((26*(month+1)/10) + year%100 +((year%100)/4)+((year/100)/4)+(5*(year/100))))%7;
        switch (dayOfWeek){
            case 0: System.out.println("the day of the week is saturday"); break;
            case 1: System.out.println("the day of the week is sunday"); break;
            case 3: System.out.println("the day of the week is monday"); break;
            case 4: System.out.println("the day of the week is tuesday");break;
            case 5: System.out.println("the day of the week is wednesday");break;
            case 6: System.out.println("the day of the week is thursday");break;
            case 7: System.out.println("the day of the week is friday");
        }
    }
    public static void main(String[] args) {
        zellersCongruence(2012,5,12);
    }
}
