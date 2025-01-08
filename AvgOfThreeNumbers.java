import java.util.Scanner;
public class AvgOfThreeNumbers{
   public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter three numbers to calculate its average: ");
       double a = sc.nextDouble();
       double b = sc.nextDouble();
       double c = sc.nextDouble();
       double res = (a+b+c)/3;
       System.out.println("Average Of Three Numbers is: " + res );
   }
}

