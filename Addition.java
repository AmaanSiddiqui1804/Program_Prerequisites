import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        double number1 = sc.nextDouble();


        System.out.print("Enter the second number: ");
        double number2 = sc.nextDouble();

    
        double sum = number1 + number2;

     
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);


    }
}