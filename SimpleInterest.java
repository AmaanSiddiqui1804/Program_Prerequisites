import java.util.Scanner;
public class SimpleInterest{
   public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter following values to calculate Simple Interest");
       System.out.println("Enter principle amount");
       int p = sc.nextInt();    // p = principle
       System.out.println("Enter Rate of interest without % sign"); 
       int r = sc.nextInt();    // r = rate of interest
       System.out.println("Enter duration in years"); 
       int t = sc.nextInt();    // t = time

       int Si = (p*r*t)/100;    // Si = Simple Interest
       System.out.println("Simple interest calculated is: " + Si);
       System.out.println("Total amount: " + (p+Si));
   }
}