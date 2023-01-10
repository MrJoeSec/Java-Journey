import java.util.Scanner;

public class AreaOfApentagon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex:");
        double length = sc.nextDouble();
        double side = (2 * length) * Math.sin(Math.PI/5); 
        double area = (5 * Math.pow(side,2)) / (4 * Math.tan(Math.PI/5));
        System.out.printf("Here is the given area: %.2f",area);
        sc.close();

    }
}