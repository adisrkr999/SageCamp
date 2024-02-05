package JavaFunctions;

public class SwitchStatements {
    public static void main(String[] args) {
        int choice = 99;
        switch(choice){
            case 1: System.out.println("Have a nice day"); break;
            case 2: System.out.println("Hi");break;
            default: System.out.println("not in the cases. enter a valid number from 1 to 3");break;
            case 3: System.out.println("Hello");break;

        }
        System.out.println("Switch case done");


        //if else
        if (choice == 1)
            System.out.println("Have a nice day");
        else if (choice == 2)
            System.out.println("Hi");
        else if (choice==3)
            System.out.println("Hello");
        else
            System.out.println("not in the cases. enter a valid number from 1 to 3");


    }

}
