import java.util.Scanner;

public class guessthenumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 100) + 1;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
            } else if (guess > randomNumber) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("Your guess is too low. Try again.");
            }

        } while (guess != randomNumber);

        sc.close();
    }
}
