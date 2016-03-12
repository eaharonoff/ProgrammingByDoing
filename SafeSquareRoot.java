import java.util.Scanner;
public class SafeSquareRoot{
	public static void main (String[]args){
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Square  root!");
		System.out.println("Enter a number: ");
		double numberSquared = keyboard.nextDouble();
		
		while (numberSquared < 0){
			System.out.println("You can't take the square root of a negative number, silly!");
			System.out.println("Try again: ");
			numberSquared = keyboard.nextDouble();	
		}

		System.out.println("The square root of " + numberSquared + " is " + Math.sqrt(numberSquared));

	}
}