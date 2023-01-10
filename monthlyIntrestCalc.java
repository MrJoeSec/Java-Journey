package CompletedProjects;
import java.util.Scanner;

public class MonthlyIntrestCalc {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the account amount and annual interest rate
        System.out.println("Enter your account amount: ");
        double amount = 0;

        // Check if the input for the account amount is a valid double
        if (input.hasNextDouble()) {
            amount = input.nextDouble();
        } else {
            // Print an error message and exit the program if the input is invalid
            System.out.println("Error: Invalid input. Please enter a valid number.");
            return;
        }

        System.out.println("Enter annual interest rate as a percentage: ");
        double annualIntrestRate = 0;

        // Check if the input for the annual interest rate is a valid double
        if (input.hasNextDouble()) {
            annualIntrestRate = input.nextDouble();
        } else {
            // Print an error message and exit the program if the input is invalid
            System.out.println("Error: Invalid input. Please enter a valid number.");
            return;
        }

        // Prompt the user to enter the number of months
        System.out.println("Enter number of months: ");
        int months = 0;

        // Check if the input for the number of months is a valid integer
        if (input.hasNextInt()) {
            months = input.nextInt();
        } else {
            // Print an error message and exit the program if the input is invalid
            System.out.println("Error: Invalid input. Please enter a valid number.");
            return;
        }

        // Calculate the monthly interest rate
        double monthlyIntrestRate = annualIntrestRate / 12;

        // Calculate the final value of the account after the specified number of months
        double finalValue = 0;
        for (int i = 1; i <= months; i++) {
            finalValue = amount + finalValue * (1 + monthlyIntrestRate);
        }

        // Print the result
        System.out.printf("Your %d month annual monthly interest amount is: $%.2f\n", months, finalValue);

        // Close the Scanner object
        input.close();
    }
}