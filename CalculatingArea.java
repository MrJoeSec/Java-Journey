/*
Program where a users radius or diameter is calculated to find the circles area 
 */

import java.util.Scanner;

public class CalculatingArea{
	public static int exitcode = 0;
	public static void main(String[] args) {
		while (exitcode != -1){
		System.out.println("Welcome to the area of a circle calculator!");
		System.out.println("Will you be using a radius or diameter? Type 0 for radius. Type 1 for diameter");
		Scanner variableType = new Scanner(System.in);
			if (variableType.nextDouble() == 1){
				System.out.println("\nEnter a given diameter: ");
				Scanner userDiameter = new Scanner(System.in);
				double diameter = userDiameter.nextDouble();
				double area = Math.PI * diameter;
				System.out.printf("Here is your given area: %.2f " ,area); 
				System.out.println("\nWould like to find the area of another circle? type 0. If not, type -1.");
				Scanner exitcodeScanner = new Scanner(System.in);
					if (exitcodeScanner.nextDouble() ==-1) {
						System.out.println("Goodbye!");
						break;
					}
			}
			else{System.out.println("\nEnter a given radius: ");
			Scanner userRadius = new Scanner(System.in);
			double radius = userRadius.nextDouble();
			double area = Math.PI * radius * radius;
				System.out.printf("Here is your given area: %.2f " ,area); 
				System.out.println("\nWould like to find the area of another circle? type 0. If not, type -1.");
				Scanner exitcodeScanner = new Scanner(System.in);
					if (exitcodeScanner.nextDouble() == -1) {
		System.out.println("GoodBye!");
		break;
	}	
	}	
	}
}
}