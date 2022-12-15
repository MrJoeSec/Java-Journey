import java.util.Scanner;
//Simple miles/kilometer converter calculator
public class MeterKilometerCalculatorV2 {
	public static void main(String[] args){
        System.out.print("Welcome to the miles/kilometer calculator");
            final double KilometerPerMile = 1.60934;
            final double milePerKilometer = 0.621371;

                System.out.print("\nWhich would you like to convert? \n Type \"1\" for miles \n Type \"2\" for Kilmeters \n Type \"3\" To exit the program ");
                Scanner input = new Scanner(System.in); //Added these 2 lines
                int variableType = input.nextInt();       //*

                if (variableType == 1){
                    System.out.println("Enter miles: ");
                    Scanner userMiles = new Scanner(System.in);
                    double miles = userMiles.nextDouble();
                    double mileToKilometer = miles * KilometerPerMile;
                    System.out.printf("Here's the miles to kilometer conversion: %.2f", mileToKilometer);}
                
                else if (variableType == 2){
                        System.out.println("Enter kilometers: ");
                        Scanner userKilometers = new Scanner(System.in);
                        double kilometers = userKilometers.nextDouble();
                        double kilometerToMeter = kilometers * milePerKilometer;
                        System.out.printf("Here's the miles to kilometer conversion: %.2f", kilometerToMeter);}

                    else {
                        System.out.println("Goodbye!");
                        return;}
                    }
                    }

// I need to get the variable type before the if else statements were called.
//Thats why the previous code did not work when kilometers was called. The program was expecting a second input

