import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        // NUMBER GUESSING GAME

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min,max);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d: ", min, max);
        do
        {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess<randomNumber)
            {
                System.out.println("TOO LOW! Try again");
            } else if (guess>randomNumber)
            {
                System.out.println("TOO HIGH! Try again");
            }
            else
            {
                System.out.printf("CORRECT! The number was %d\n",randomNumber);
            }
        } while(guess != randomNumber);

        System.out.printf("# of attempts: %d",attempts);

        scanner.close();
    }
}