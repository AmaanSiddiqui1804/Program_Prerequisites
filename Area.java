import java.util.Scanner;
public class Area{
   public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter radius of circle to find area");

      double r = sc.nextDouble(); // r = Radius 

      double area = Math.PI *r*r ;
      System.out.println("Area of circle is: " + area);
   }
}