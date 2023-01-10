import java.util.Scanner;

// Simple miles/kilometer converter calculator
public class MeterKilometerCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the miles/kilometer calculator");
        final double KilometerPerMile = 1.60934;
        final double MilePerKilometer = 0.621371;

        // Initialize the variable for the user's choice
        int variableType = 0;

        // Keep taking user input and performing conversions until the user chooses to exit the program
        while (variableType != 3) {
            // Prompt the user to choose which conversion they want to perform
            System.out.println("Which would you like to convert? \nType \"1\" for miles \nType \"2\" for kilometers \nType \"3\" to exit the program");
            Scanner variableTypeScanner = new Scanner(System.in);
            
            // Check if the input is a valid integer
            if (variableTypeScanner.hasNextInt()) {
                variableType = variableTypeScanner.nextInt();
            } else {
                // Print an error message and continue the loop if the input is invalid
                System.out.println("Error: Invalid input. Please enter a valid number.");
                continue;
            }

            // Perform the conversion based on the user's choice
            if (variableType == 1) {
                System.out.println("Enter miles: ");
                Scanner userMilesScanner = new Scanner(System.in);
                double miles = 0;
                
                // Check if the input is a valid double
                if (userMilesScanner.hasNextDouble()) {
                    miles = userMilesScanner.nextDouble();
                } else {
                    // Print an error message and continue the loop if the input is invalid
                    System.out.println("Error: Invalid input. Please enter a valid number.");
                    continue;
                }
                double mileToKilometer = miles * KilometerPerMile;
                System.out.printf("Here's the miles to kilometer conversion: %.2f \n", mileToKilometer);
            } else if (variableType == 2) {
                System.out.println("Enter kilometers: ");
                Scanner userKilometersScanner = new Scanner(System.in);
                double kilometers = 0;
                
                // Check if the input is a valid double
                if (userKilometersScanner.hasNextDouble()) {
                    kilometers = userKilometersScanner.nextDouble();
                } else {
                    // Print an error message and continue the loop if the input is invalid
                    System.out.println("Error: Invalid input. Please enter a valid number.");
                    continue;
                }
                double kilometerToMile = kilometers * MilePerKilometer;
                System.out.printf("Here's the kilometers to mile conversion: %.2f \n", kilometerToMile);
            } else if (variableType == 3) {
                // If the user chose to exit the program, print a goodbye message and break out of the loop
                System.out.println("Error: Invalid input. Please enter a number between 1 and 3.");
            }
        }
    }}