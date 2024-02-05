public class ArrayExample {
    public static void main(String[] args) {
        int[] marks = {25,24};
        int sum = 0;
        for(int index = 0; index< marks.length; index++){
           sum =  sum + marks[index];
        }
        System.out.println("Sum is "+sum);





        double average = (double) sum/marks.length;
        System.out.println("Average is "+average);
    }

}
