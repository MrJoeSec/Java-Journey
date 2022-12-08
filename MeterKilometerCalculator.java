package CompletedProjects;
import java.util.Scanner;
//Simple miles/kilometer converter calculator
public class MeterKilometerCalculator {
	public static void main(String[] args){
        System.out.print("Welcome to the miles/kilometer calculator");
            final double KilometerPerMile = 1.60934;
            final double milePerKilometer = 0.621371;

                System.out.print("\nWhich would you like to convert? \n Type \"1\" for miles \n Type \"2\" for Kilmeters \n Type \"3\" To exit the program ");
                Scanner variableType = new Scanner(System.in);
                if (variableType.nextDouble() == 1){
                    System.out.println("Enter miles: ");
                    Scanner userMiles = new Scanner(System.in);
                    double miles = userMiles.nextDouble();
                    double mileToKilometer = miles * KilometerPerMile;
                    System.out.printf("Here's the miles to kilometer conversion: %2f", mileToKilometer);}
                
                else if (variableType.nextDouble() == 2){
                        System.out.println("Enter kilometers: ");
                        Scanner userKilometers = new Scanner(System.in);
                        double kilometers = userKilometers.nextDouble();
                        double kilometerToMeter = kilometers * milePerKilometer;
                        System.out.printf("Here's the miles to kilometer conversion: %2f", kilometerToMeter);}

                    else {
                        System.out.println("Goodbye!");
                        return;}}
                    }

//program only works if input = 1


