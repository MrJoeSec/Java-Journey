import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatingArea {
public static int exitcode = 0;
public static void main(String[] args) {
    while (exitcode != -1) {
        // Welcome message
        System.out.println("Welcome to the area of a circle calculator!");
        System.out.println("Will you be using a radius or diameter? Type 0 for radius. Type 1 for diameter");

        // Declare scanner for user input
        Scanner variableType = new Scanner(System.in);

        // Try-catch block for error handling
        try {
            int input = variableType.nextInt();
            if (input == 1) {
                System.out.println("\nEnter a given diameter: ");
                Scanner userDiameter = new Scanner(System.in);
                double diameter = userDiameter.nextDouble();
                double area = Math.PI * diameter;
                System.out.printf("Here is your given area: %.2f ", area);
            } else if (input == 0) {
                System.out.println("\nEnter a given radius: ");
                Scanner userRadius = new Scanner(System.in);
                double radius = userRadius.nextDouble();
                double area = Math.PI * radius * radius;
                System.out.printf("Here is your given area: %.2f ", area);
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please try again.");
            variableType.nextLine();
            continue;
        }

        // Prompt user to calculate again or exit
        System.out.println("\nWould like to find the area of another circle? type 0. If not, type -1.");
        Scanner exitcodeScanner = new Scanner(System.in);
        try {
            int input = exitcodeScanner.nextInt();
            if (input == -1) {
                System.out.println("Goodbye!");
                break;
            } else if (input != 0) {
                System.out.println("Invalid input. Please try again.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please try again.");
            exitcodeScanner.nextLine();
            continue;
        }
    }
}}