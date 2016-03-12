import java.util.Scanner;

public class dude 
{
	
	public static void main(String[] args)
	{	
		Scanner keyboard = new Scanner (System.in);
		int num1, num2; 

		System.out.println ("Type in a number. " );
		num1 = keyboard.nextInt();

		System.out.println ("Ok. Type in a second number." );
		num2 = keyboard.nextInt ();

		int result = love (num1, num2 );

		System.out.println ("The answer is " + result );
	}//MAIN

	public static int love ( int a, int b) 
	{
		if ( a <= 0)
		{
			return a + b;
		}
		

		else if (a >= 0 )
		{
			return a*b ;
		}
		return 0;
	}	
}//CLASS