import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String args[]) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(10) + 1;

        boolean quit = false;
        while (!quit) {
            int guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Correct!");
                quit = true;
            } 
            else if (guess > randomNumber) {
                System.out.println("Incorrect! Too High!");
            } 
            else if (guess < randomNumber) {
                System.out.println("Incorrect! Too Low!");
            }
        }

        scanner.close();
    }
}