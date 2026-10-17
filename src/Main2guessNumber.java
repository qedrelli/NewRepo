import java.util.Scanner;
import java.util.Objects;
import java.util.Random;

public class Main2guessNumber {
    public static void main(String[] args) {

        Scanner game = new Scanner(System.in);

        Random number = new Random();
        int secret = number.nextInt(10);

        System.out.println("There is a secret number from 0 to 9.");
        for(int i = 1; i <= 5; i++) {
            System.out.print("Enter your guess: ");
            int guess = game.nextInt();
            if (guess < 0 || guess > 9) {
                System.out.println("Secret number is between 0 and 9!");
                i--;
                continue;
            }

            if (Objects.equals(secret, guess)) {
                System.out.println("Correct!\nYou needed " +i+ " attempts.");
                break;
            }
            else if (guess < secret) {
                System.out.println("Too low!");
                if (i == 5)
                    System.out.println("Game over.\nThe secret number was: "+secret);
            }
            else if (guess > secret) {
                System.out.println("Too high!");
                if (i == 5)
                    System.out.println("Game over.\nThe secret number was: "+secret);

            }
        }
    }
}