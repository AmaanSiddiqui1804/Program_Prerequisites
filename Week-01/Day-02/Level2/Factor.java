


//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class Factor{
	public static void main(String[] args){
        
		// Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number ");
		int number = input.nextInt();
		
		int greatestFactor = 1;
		for (int i = number - 1; i > 1; i--){
			if (number % i == 0){
				greatestFactor = i;
				break;
			}
		}
		System.out.println("The greatest factor is: " + greatestFactor);
	}
}
