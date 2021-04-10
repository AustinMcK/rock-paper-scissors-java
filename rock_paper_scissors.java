import java.util.Scanner;

public class rock_paper_scissors {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String move,response = "y";
        int userScore=0, compScore=0;
        do{
            int compMove=(int)(Math.random()*3);
            if(response.equalsIgnoreCase("y")) {
                System.out.print("Enter your move: ");
                move = input.next();
                if (move.equals("rock") || move.equals("Rock")) {
                    if (compMove == 0) {
                        System.out.print("\nThe computer also chose rock. It is a tie.");
                    } else if (compMove == 1) {
                        System.out.print("\nThe computer chose paper and wins.");
                        compScore++;
                    } else {
                        System.out.print("\nThe computer chose scissors and you win!");
                        userScore++;
                    }
                } else if (move.equals("paper") || move.equals("Paper")) {
                    if (compMove == 0) {
                        System.out.print("\nThe computer chose rock and you win!");
                        userScore++;
                    } else if (compMove == 1) {
                        System.out.print("\nThe computer also chose paper. It is a tie.");
                    } else {
                        System.out.print("\nThe computer chose scissors and wins.");
                        compScore++;
                    }
                } else if (move.equals("scissors") || move.equals("Scissors")) {
                    if (compMove == 0) {
                        System.out.print("\nThe computer chose rock and wins.");
                        compScore++;
                    } else if (compMove == 1) {
                        System.out.print("\nThe computer chose paper and you win!.");
                        userScore++;
                    } else {
                        System.out.print("\nThe computer also chose scissors. It is a tie");
                    }
                } else {
                    System.out.print("\nPlease enter either rock paper or scissors.");
                }
            }else if(response.equalsIgnoreCase("s")){
                System.out.printf("You have %d wins and the computer has %d wins.",userScore,compScore);
            }
            System.out.print("\nDo you want to play again? (y/n) or type (s) to view score: ");
            response=input.next();
            System.out.println();

        }while(response.equalsIgnoreCase("y")||response.equalsIgnoreCase("s"));
        if(userScore>compScore){
            System.out.printf("You win! The with the final score user: %d\tcomputer: %d.",userScore,compScore);
        }else if(userScore<compScore){
            System.out.printf("The computer wins with the final score user: %d\tcomputer: %d.",userScore,compScore);
        }else{
            System.out.printf("The result is a tie with the final score user: %d\tcomputer: %d.",userScore,compScore);
        }
        System.out.print("\nThanks for playing. -Austin");
    }
}
