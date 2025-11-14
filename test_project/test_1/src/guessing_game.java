import java.util.Scanner;
import java.util.Random;

public class guessing_game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int secret = rand.nextInt(100) + 1; // 1 to 100
        int guess = 0;
        int tries = 0;

        System.out.println("🎮 Welcome to the Number Guessing Game!");
        System.out.println("I picked a number between 1 and 100. Try to guess it!");

        while (guess != secret) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            tries++;

            if (guess < secret) {
                System.out.println("Too low!");
            } else if (guess > secret) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You got it in " + tries + " tries.");
            }
        }

        input.close();
    }
}
