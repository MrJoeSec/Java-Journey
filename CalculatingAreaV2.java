package CompletedProjects;
import java.util.Scanner;
//updated version of CalculatingArea.java
//To combat the fact that my program was too messy, I learned how to use methods, rather than just having everything in the main program.
public class CalculatingAreaV2 {
    static Scanner scanner = new Scanner(System.in);
    private static void printPrompt() {
        System.out.println("Welcome to the area of a circle calculator!");
        System.out.println("Will you be using a radius or diameter? Type 0 for radius. Type 1 for diameter");
    }
    private static void calcArea(boolean radius) {
        System.out.print(radius ? "Enter a given radius: " : "Enter a given diameter: ");
        // I learned how to use a ternary operator and used that instead of writing multiple if statements to shorten my program
        double input = scanner.nextDouble();
        double r = radius ? input : input / 2.0;    
        double area = Math.PI * r * r;
        System.out.printf("Here is your given area: %.2f\n", area);
    }
    public static void main(String[] args) {
        while (true) {
            printPrompt(); //I learned how to call a method into the main program
            boolean radiusInput = scanner.nextInt() == 0;
            calcArea(radiusInput);
            System.out.println("Would like to find the area of another circle? type 0. If not, type -1.");
            if (scanner.nextInt() == -1) {
                System.out.println("Goodbye!");
                return;
            }
        }
    }
}
//I am way more satisfied with this program rather that the previous one :)