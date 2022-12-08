package CompletedProjects;
import java.util.Scanner;

public class InterestDoubleCalc {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an ammount of money that you want to see double with 7 percent intereset ");
    double ammount = sc.nextDouble();
    double ammount2 = ammount * 2;
    int year = 0;
    while (ammount < ammount2 * 2){
        ammount = ammount * 1.07;
        year++;
    }
    System.out.println("In " + year + " years, your ammount will double");}
}


//Problem with this code is that it does not stop the while even after the ammount doubles