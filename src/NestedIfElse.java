public class NestedIfElse {
    public static void main(String[] args) {

        String decision = "yes";
        String movieTicketsBought = "yes";
        String movieHall = "open";



        if (decision == "yes"){
            if(movieTicketsBought =="yes"){
                if(movieHall == "open"){
                    System.out.println("I will be watching the movie");
                }
                else{
                    System.out.println("The movie hall is closed");
                }
            }
            else{
                System.out.println("Sorry guys .. forgot");
            }
        }
        else{
            System.out.println("Parents denied :(");
        }






    }
}
