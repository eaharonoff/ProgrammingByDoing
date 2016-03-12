import java.util.Scanner;
public class HowOldAreYou2 
{
	public static void main ( String [] args )
	{
		Scanner keyboard = new Scanner (System.in);
		int age;
		String name;

		System.out.println ("Hey. what's your name? (Sorry I keept forgetting.)" );
		name = keyboard.next();

		System.out.println ("Ok, " + name + ", how old are you? " );
		age= keyboard.nextInt();

		if ( age < 16 ) 
		{
			System.out.println ("You can't drive, " + name ); 		
		}
		else if (age <= 17 )
		{
			System.out.println ("You can drive, but you can't vote, " + name );
		}
		else if ( age <= 24)
		{
			System.out.println ("You can vote but you can't rent a car, " + name );
		}
		else 
		{
			System.out.println ("You can pretty much do anything, " + name );
		}
	}
}