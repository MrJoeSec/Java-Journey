import java.util.Scanner;

public class RootCalculator {
    public static void main(String[] args) { 
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the values of a, b, and c
        System.out.println("Enter values for a, b, and c:");
        double a = 0;
        double b = 0;
        double c = 0;

        // Check if the input for a is a valid double
        if (scanner.hasNextDouble()) {
            a = scanner.nextDouble();
        } else {
            // Print an error message and exit the program if the input is invalid
            System.out.println("Error: Invalid input. Please enter a valid number.");
            return;
        }

        // Check if the input for b is a valid double
        if (scanner.hasNextDouble()) {
            b = scanner.nextDouble();
        } else {
            // Print an error message and exit the program if the input is invalid
            System.out.println("Error: Invalid input. Please enter a valid number.");
            return;
        }

        // Check if the input for c is a valid double
        if (scanner.hasNextDouble()) {
            c = scanner.nextDouble();
        } else {
            // Print an error message and exit the program if the input is invalid
            System.out.println("Error: Invalid input. Please enter a valid number.");
            return;
        }

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Calculate the roots of the equation
        double r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        // Check the number of roots and print the result
        if (discriminant == 0) {
            System.out.printf("The equation has 1 root: %.6f", r1);
        } else if (discriminant > 0) {
            System.out.printf("The equation has 2 roots: %.6f and %.6f", r1, r2);
        } else {
            System.out.println("The equation has no roots.");
        }

        // Close the Scanner object
        scanner.close();
    }
}