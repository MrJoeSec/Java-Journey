package CompletedProjects;
import java.util.Random;
import java.util.Scanner;

public class RandomNumGen{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bounds Two bounds: ");
        int bound1 = sc.nextInt();
        int bound2 = sc.nextInt();
        Random rand = new Random();
        int randomVal = rand.nextInt(bound2-bound1)+bound1;
        System.out.println("Random Integersdouble: "+randomVal);
    sc.close();}
}

// code does not work if the first bound is larger that second