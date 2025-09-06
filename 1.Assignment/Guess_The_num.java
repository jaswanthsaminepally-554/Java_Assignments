import java.util.Scanner;
import java.util.Random;

public class Guess_The_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int target = rand.nextInt(100) + 1; 
        int guess;
        do {
            System.out.print("Guess the number (1–100): ");
            guess = sc.nextInt();
            if (guess > target) {
                System.out.println("Too high!");
            } else if (guess < target) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! The number was " + target);
            }
        } while (guess != target);

        sc.close();
    }
}