import java.util.Scanner;

public class CalculatingAreaV2 {
    static Scanner scanner = new Scanner(System.in);

    private static void printPrompt() {
        System.out.println("Welcome to the area of a circle calculator!");
        System.out.println("Will you be using a radius or diameter? Type 0 for radius. Type 1 for diameter");
    }

    private static void calcArea(boolean radius) {
        System.out.print(radius ? "Enter a given radius: " : "Enter a given diameter: ");
        double input = scanner.nextDouble();
        double r = radius ? input : input / 2.0;
        double area = Math.PI * r * r;
        System.out.printf("Here is your given area: %.2f\n", area);
    }

    public static void main(String[] args) {
        while (true) {
            printPrompt();
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