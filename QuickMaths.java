package CompletedProjects;
import java.util.Scanner;
public class QuickMaths {
    public static void main(String [] args){
        int num1 = (int)(Math.random() * 100) ;
        int num2 = (int)(Math.random() * 100);
        System.out.println("What is "+num1+"+"+num2+"?");
        Scanner sc = new Scanner(System.in);
        int response = sc.nextInt();
        while (num1+num2!=response){
            System.out.println("Wrong answer! Try again... ");
            System.out.println("What is "+num1+"+"+num2+"?");
            response = sc.nextInt();
        }
        System.out.println("Good job! ");
        sc.close();
}
}

//just a quick game to test your addition. Learned how to generate random numbers