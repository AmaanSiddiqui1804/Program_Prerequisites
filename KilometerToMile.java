import java.util.Scanner;
public class KilometerToMile{
   public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter distance in kilometers: ");
       double d = sc.nextDouble();
       
       double res = d*0.621371d ;
       
       System.out.println("Distance in Miles is: " + res);
   }
}
