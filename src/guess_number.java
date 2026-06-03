import java.util.Scanner;
import java.util.Random;

public class guess_number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;
        int maxNum;

        System.out.println("Guess the Number Game!");

        while (playAgain) {
            while (true) {
                System.out.println("chose the difficulty");
                System.out.println("1 - Easy (1-50)");
                System.out.println("2 - Medium (1-100)");
                System.out.println("3 - Hard (1-500)");
                System.out.print("Enter:");
                int choose = input.nextInt();


                if (choose == 1) {
                    maxNum = 50;
                    break;
                }
                else if (choose == 2) {
                    maxNum = 100;
                    break;
                }
                else if (choose == 3) {
                    maxNum = 500;
                    break;
                }
                else {
                    System.out.println("Please try again!");
                }
            }

            int secretNumber = random.nextInt(maxNum) + 1;
            int guess = 0;
            int attempts = 0;

            System.out.println("I picked a number between 1 and " + maxNum);

            while (guess != secretNumber) {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
                attempts ++;

                if (guess > secretNumber) {
                    System.out.println("num is lower!");
                }
                else if (guess < secretNumber) {
                    System.out.println("num is higher!");
                }
                else {
                    System.out.println("you won!");
                    System.out.println("Attempts: " + attempts);
                }
            }

            System.out.print("Would you like to play again? (yes/no):");
            input.nextLine();
            String answer = input.nextLine();
            if (!answer.equalsIgnoreCase("yes")){
                playAgain = false;
            }
        }
        input.close();
        System.out.println("Thanks for playing!");
    }
}