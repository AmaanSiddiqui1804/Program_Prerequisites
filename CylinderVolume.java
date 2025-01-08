import java.util.Scanner;
public class CylinderVolume{
   public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter radius and height of cylinder to calculate its Volume");
       double height = sc.nextDouble();
       double radius = sc.nextDouble();
       double v = Math.PI *radius*radius*height;
      
      System.out.println("Volume of Cylinder is: " + v);
   }
}