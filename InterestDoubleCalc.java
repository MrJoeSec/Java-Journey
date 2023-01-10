import java.util.Scanner;

public class InterestDoubleCalc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter an amount of money to double
        System.out.println("Enter an amount of money that you want to see double with 7% interest:");
        double ammount = 0;

        // Check if the input is a valid double
        if (sc.hasNextDouble()) {
            ammount = sc.nextDouble();
        } else {
            // Print an error message and exit the program if the input is invalid
            System.out.println("Error: Invalid input. Please enter a valid number.");
            return;
        }

        // Calculate the target amount
        double targetAmount = ammount * 2;

        // Initialize the number of years to zero
        int year = 0;

        // Loop until the amount has doubled
        while (ammount < targetAmount) {
            ammount = ammount * 1.07;
            year++;
        }

        // Print the result
        System.out.println("In " + year + " years, your amount will double.");
    }
}