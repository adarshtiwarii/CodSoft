 import java.util.Random;
import java.util.Scanner;

public class numbergame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 11;
        int score = 0;

        System.out.println("Welcome to the Guessing Game!");

        boolean playAgain = true;
        while (playAgain) {
            int generatedNumber = ra.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("\nI have generated a number between " + minRange + " and " + maxRange + ". You have " + maxAttempts + " attempts to guess it.");

            int attempts = 0;  
            boolean guessedCorrectly = false;

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempt(s)!");
                    score++;
                    guessedCorrectly = true;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("\nGame over! You couldn't guess the number. The correct number was: " + generatedNumber);
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            String playAgainResponse = sc.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes") || playAgainResponse.equals("y");
        }

        System.out.println("\nYour final score is: " + score);
        System.out.println("Thank you for playing the Guessing Game!");
        sc.close();
    }
}


