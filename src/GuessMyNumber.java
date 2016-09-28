/**
 * Created by jfabiano on 9/27/2016.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        System.out.println("GuessMyNumber is running!");
        String userInput = "";
        Scanner myScanner = new Scanner(System.in);
        do {
            try {
                // Ask the user for their number
                // and store it in an int variable
                System.out.println("Please enter a number between 0 and 10");
                Scanner inputScanner = new Scanner(System.in);
                int userNumber = inputScanner.nextInt();
                System.out.println("You entered: " + userNumber);

                // Generate a random number between 0 and 10
                // and store it in another int variable
                int computerNumber = (int) (Math.random() * 10);
                System.out.println("Computer generated: " + computerNumber);

                // Compare the two and display who won
                if (userNumber > computerNumber) {
                    System.out.println("You win!");
                } else {
                    System.out.println("I win!");
                }
            } catch (InputMismatchException e) {
                System.out.println("The value entered is not a number.\nDo you want to play again(y = yes, n = no)?");
                userInput = myScanner.nextLine();
                if (userInput == "n") {
                    break;
                }
            }
        }
        while(!userInput.equals("n"));
        System.out.println("Thank you for playing!");
    }

}
