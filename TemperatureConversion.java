import java.util.Scanner;
public class TemperatureConversion{
   public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter °Celsius temperature value to convert it in Fahrenheit: ");
      float c = sc.nextFloat(); //    c = Celcius
      float Fahrenheit = (c*(9/5))+32 ;

      System.out.println("Temperature in Celsius: " + c );
      System.out.println("Temperature in Fahreheit: " + Fahrenheit );   
   }
}