package hw;

public class Question17 {
    public static void rockPaperScissors(String objectPlayer){
            double num = Math.floor(Math.random()*(2-0+1)+0);
            String objectComputer;
            if (num==0)
                objectComputer = "rock";
            else if (num==1)
                objectComputer = "paper";
            else
                objectComputer = "scissors";

            //play game
            if (objectComputer=="rock" && objectPlayer=="rock")
                System.out.println("the computer is rock. you are rock. it's a tie.");
            else if (objectComputer=="paper" && objectPlayer=="paper")
                System.out.println("the computer is paper. you are paper. it's a tie.");
            else if (objectComputer=="scissors" && objectPlayer=="scissors")
                System.out.println("the computer is scissors. you are scissors. it's a tie.");
            else if (objectComputer=="paper" && objectPlayer=="rock")
                System.out.println("the computer is paper. you are rock. you lose.");
            else if (objectComputer=="scissors" && objectPlayer=="rock")
                System.out.println("the computer is scissors. you are rock. you win.");
            else if (objectComputer=="scissors" && objectPlayer=="paper")
                System.out.println("the computer is scissors. you are paper. you lose.");
            else if (objectComputer=="paper" && objectPlayer=="scissors")
                System.out.println("the computer is paper. you are scissors. you win.");
            else if (objectComputer=="rock" && objectPlayer=="scissors")
                System.out.println("the computer is rock. you are scissors. you lose.");
            else if (objectComputer=="rock" && objectPlayer=="paper")
                System.out.println("the computer is rock. you are paper. you win.");
        }

        public static void main(String[] args) {
            rockPaperScissors("rock");
        }
    }

