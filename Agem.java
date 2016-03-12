import java.util.Scanner;
	public class Agem
	{
		public static void main ( String [] args )
		{	Scanner keyboard = new Scanner (System.in);
			System.out.println ( "Name: " );
			String name = keyboard.next();
			System.out.println ("Age: " );
			int age = keyboard.nextInt();

			if ( age < 16 )
			{
				System.out.println ("You can't drive, " + name + ".");
			}//less than 16

			if (age >= 16 && age <= 17 )
			{
				System.out.println ("You can drive but not vote." + name + ".");
			}// btwn 16-17

			if (age >= 18 && age <= 24 )
			{
				System.out.println ("You can vote but you cannot rent a car, " + name + ".");
			}

			if (age >= 25 )
			{
				System.out.println ("You can pretty much do anything," + name + "." );
			}// greater than or equal to 25
		}//main 
	}//class
