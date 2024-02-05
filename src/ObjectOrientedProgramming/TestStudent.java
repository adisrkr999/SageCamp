package ObjectOrientedProgramming;

import java.util.Date;

public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student(1122,"Mike");
        System.out.println("The date is: "+s.getDateCreated());
        Date date1 = s.getDateCreated();
        date1.setTime(20000000);
        System.out.println("The date is: "+s.getDateCreated());
    }


}
