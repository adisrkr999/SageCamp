public class ArrayAverageUsingAdvancedForLoops {
    public static void main(String[] args) {
       /* int[] marks = {75,80};
        int sum =0;
        for (int each_marks : marks){
            sum = sum + each_marks;
        }

        System.out.println(sum);

        double average = (double) sum/marks.length;
        System.out.println("Average is "+average);
        */

        double[] marks = {75,80};
        double sum =0;
        for (double each_marks : marks){
            sum = sum + each_marks;
        }

        System.out.println(sum);

        double average =  sum/marks.length;
        System.out.println("Average is "+average);
    }
}
