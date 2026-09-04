import java.util.Scanner;
import java.util.Random;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args){
        // Rock Paper Scissors Game
        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        Boolean playAgain = true;

        do{
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock")
                    && !playerChoice.equals("paper")
                    && !playerChoice.equals("scissors"))
            {
                System.out.println("Invalid choice");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: "+ computerChoice);

            if(playerChoice.equals(computerChoice))
            {
                System.out.println("It's a tie!");
            }
            else if(playerChoice.equals("rock") && computerChoice.equals("scissors"))
            {
                System.out.println("You win!");
            }

            else if(playerChoice.equals("scissors") && computerChoice.equals("paper"))
            {
                System.out.println("You win!");
            }

            else if(playerChoice.equals("paper") && computerChoice.equals("rock"))
            {
                System.out.println("You win!");
            }
            // or on this syntax
            /*
             * if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
             *   (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
             *   (playerChoice.equals("paper") && computerChoice.equals("rock"))){System.out.println("You win!")}
             * */

            else
            {
                System.out.println("You lose!");
            }

            System.out.print("Play again? (Yes/No): ");
            playAgain = scanner.nextLine().equals("yes")?true:false;
        } while(playAgain);

        System.out.println("Thanks for playing!");

        scanner.close();
    }
}