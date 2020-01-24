import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random dice1 = new Random();
        Random dice2 = new Random();

        int score = 0;
        String again = "yes";

        System.out.println("Welcome! Let's Play Roll Dice!");

        while (again.equalsIgnoreCase("yes") && (score < 100)) {
            int num1 = 1 + dice1.nextInt(6);
            int num2 = 1 + dice2.nextInt(6);

            System.out.println("Your rolls " + num1 + " & " + num2);

            if (num1 != 1 && num2 != 1) {
                score = score + num1 + num2;
            }

            if (num1 == 1 && num2 == 1) {
                score = score + 25;
            }

            System.out.println("Score: " + score);
            System.out.print("Roll again? ");
            again = input.next();

            while (!again.equalsIgnoreCase("no") && !again.equalsIgnoreCase("yes")) {
                System.out.println("Please answer yes or no.");
                System.out.print("Roll again? ");
                again = input.next();
            }

            System.out.println();
        }

        if (score > 100) {
            System.out.println("You have scored over 100");
        }
        else if (score == 100) {
            System.out.println("You have scored exactly 100!");
        }

        System.out.println("Thank you for playing!");
    }
}
