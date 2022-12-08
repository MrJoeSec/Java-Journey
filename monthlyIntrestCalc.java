package CompletedProjects;
import java.util.Scanner;

public class monthlyIntrestCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Get user amount and intrest rate
        System.out.println("Enter you account ammount: ");
        double amount = input.nextDouble();

        System.out.println("Enter annual intrest ammount as a percentage: ");
        double annualIntrest = input.nextDouble();

        System.out.println("Enter how many months: ");
        int months = input.nextInt();
        double monthlyIntrest = annualIntrest / 12;
        double finalValue = 0;
        
        for (int i = 1; i <= months; i++){
            finalValue = amount+finalValue * (1+monthlyIntrest);
        }
        System.out.printf("Your " +months+ "month annual monthly intrest amount is: $%.2f \n", finalValue);
        input.close();
    }
}