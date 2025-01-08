import java.util.Scanner;
public class PerimeterRectangle{
   public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter length and width of Rectangle to calculate its Perimeter");
      int l = sc.nextInt();
      int w = sc.nextInt();
      int p = 2*(l+w);  // p = perimeter
      System.out.println("Perimeter of Rectangle is: " + p);
   }
}