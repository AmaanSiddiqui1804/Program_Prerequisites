import java.util.*;
public class PowerCalculation{
   public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter base value and exponent to calculate base raised to the power: ");
      int b = sc.nextInt(); // b = base
      int e = sc.nextInt(); // e = exponent
      double result = Math.pow(b , e);
      System.out.println("Result is: " + result);
   }
}