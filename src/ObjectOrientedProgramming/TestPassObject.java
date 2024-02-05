package ObjectOrientedProgramming;

public class TestPassObject {
    public static void main(String[] args) {
        CircleWithPrivateDataFields circle = new CircleWithPrivateDataFields(1);
        printAreas(circle,100);
    }
    public static void printAreas(CircleWithPrivateDataFields circle ,int times){
        System.out.println("Radius \t\tArea");
        while(times>=1){
            //code
            System.out.println(circle.getRadius()+"\t\t"+ circle.getArea());
            circle.setRadius(circle.getRadius()+1);
            times--;
        }
    }
}
