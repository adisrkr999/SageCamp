package ObjectOrientedProgramming;

public class ArrayOfObjects {
    public static void main(String[] args) {
        //Declare the array
        CircleWithPrivateDataFields[] circleArray;
        circleArray = createCircleArray();
        printCircleArray(circleArray);
    }
    public static CircleWithPrivateDataFields[] createCircleArray(){
        CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];
        for(int i =0;i<5;i++){
            circleArray[i] = new CircleWithPrivateDataFields(Math.random()*100);

        }
        return circleArray;
    }
    public static void printCircleArray(CircleWithPrivateDataFields[] circleArray){
        System.out.println("Radius\t\t\t\t\t\tArea");
        for(int i =0;i< circleArray.length;i++){
            System.out.println(circleArray[i].getRadius()+"\t\t"+circleArray[i].getArea());
        }
    }

}
