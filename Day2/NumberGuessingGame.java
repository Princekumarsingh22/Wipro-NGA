import java.util.*;
import java.util.Random;

public class NumberGuessingGame 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do 
        {
            // Generate a random number between 1 and 100
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 10;
            boolean hasGuessedCorrectly = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have picked a number between 1 and 100.");
            System.out.println("You have " + attempts + " attempts to guess it.");

            // Loop for user attempts
            for (int i = 0; i < attempts; i++) 
            {
                System.out.print("Enter your guess: ");
                int guess = s.nextInt();

                if (guess < 1 || guess > 100) 
                {
                    System.out.println("Invalid guess. Please enter a number between 1 and 100.");
                    i--; // Do not count this as an attempt
                    continue;
                }

                if (guess < targetNumber) 
                {
                    System.out.println("Too low!");
                } else if (guess > targetNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    hasGuessedCorrectly = true;
                    break;
                }

                System.out.println("Attempts remaining: " + (attempts - i - 1));
            }

            if (!hasGuessedCorrectly) 
            {
                System.out.println("Sorry, you've run out of attempts. The number was " + targetNumber + ".");
            }

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String response = s.next();
            playAgain = response.equalsIgnoreCase("yes");

        } 
        while (playAgain);

        System.out.println("Thank you for playing the Number Guessing Game!");
    }
}
