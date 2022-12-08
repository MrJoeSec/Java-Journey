package CompletedProjects;
import java.util.Scanner;

public class rootcalculator {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter value for a, b, c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();   
        double discriminant =  b*b - 4*a*c;
        double r1 = -b + Math.sqrt((Math.pow(b,2) - 4*a*c)/2*a);
        double r2 = -b - Math.sqrt((-b - Math.pow(b,2) - 4*a*c)) / 2*a;
        if (discriminant == 0){
            System.out.printf("The equation has 1 roots %.6f", r1);}
        else if (discriminant % 2 == 0){
            System.out.printf("The equation has 2 roots %.6f and %.6f", r1 , r2);}
        else{
            System.out.println("The equation has no roots");
    }
    scanner.close();}
    }
// recieves "NaN"