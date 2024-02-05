package JavaFunctions;

public class Functions3 {
    public static void Grades(double score){
        if (score>=90.0)
            System.out.println('A');
        else if (score>=80.0)
            System.out.println('B');
        else if (score>=70)
            System.out.println('C');
        else if (score>=60)
            System.out.println('D');
        else
            System.out.println('F');

    }
    public static char getGrades(double score){
        if (score>=90.0)
            return 'A';
        else if (score>=80.0)
            return 'B';
        else if (score>=70)
            return 'C';
        else if (score>=60)
            return 'D';
        else
           return 'F';

    }
    public static void main(String[] args) {
        Grades(88); //without return
        //System.out.println(getGrades(88));
        // with return
        char acquiredGrade = getGrades(99);
        System.out.println("The grade is "+acquiredGrade);

    }
}
