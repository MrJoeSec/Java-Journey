import java.util.Scanner; // import the Scanner class from the java.util package

public class AreaOfPentagon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // create a Scanner object to read input from the user

        double length; // declare a constant variable to store the length from the center to a vertex

        // use a while loop to continue prompting the user for input until a valid value is entered
        while (true) {
            System.out.println("Enter the length from the center to a vertex to calculate the area of a pentagon:");

            try {
                length = sc.nextDouble(); // try to read and assign the user's input to the length variable

                if (length <= 0) { // if the length is less than or equal to zero, print an error message
                    System.out.println("Error: Length must be a positive number.");
                } else { // if the length is valid, exit the loop
                    break;
                }
            } catch (Exception e) { // if an exception is thrown (e.g. invalid input), print an error message
                System.out.println("Error: Invalid input. Please enter a valid number.");
                sc.nextLine(); // consume the invalid input and allow the program to continue
            }
        }

        // calculate the length of one side of the pentagon using the given length and the fact that the pentagon is regular
        double side = (2 * length) * Math.sin(Math.PI/5);

        // calculate the area of the pentagon using the side length and the fact that the pentagon is regular
        double area = (5 * Math.pow(side,2)) / (4 * Math.tan(Math.PI/5));

        // print the area of the pentagon to the console, formatted with two decimal places
        System.out.printf("Here is the given area of your pentagon: %.2f",area);

        sc.close(); // close the Scanner object to release any resources it is using
    }
}