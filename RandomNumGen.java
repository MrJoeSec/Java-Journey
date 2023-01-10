
import java.util.Random;
import java.util.Scanner;

public class RandomNumGen {
    public static void main(String args[]) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the bounds for the random number
        System.out.println("Enter two bounds to pick a number inbetween them: ");
        int bound1 = 0;
        int bound2 = 0;

        // Check if the input for the first bound is a valid integer
        if (sc.hasNextInt()) {
            bound1 = sc.nextInt();
        } else {
            // Print an error message and exit the program if the input is invalid
            System.out.println("Error: Invalid input. Please enter a valid number.");
            return;
        }

        // Check if the input for the second bound is a valid integer
        if (sc.hasNextInt()) {
            bound2 = sc.nextInt();
        } else {
            // Print an error message and exit the program if the input is invalid
            System.out.println("Error: Invalid input. Please enter a valid number.");
            return;
        }

        // Create a Random object to generate a random number
        Random rand = new Random();

        // Generate a random integer between the bounds
        int randomVal = rand.nextInt(bound2 - bound1) + bound1;

        // Print the result
        System.out.println("Random integer: " + randomVal);

        // Close the Scanner object
        sc.close();
    }
}

