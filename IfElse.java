public class IfElse 
{
	public static void main ( String [] args )
	{
		int people = 30;
		int cars= 35;
		int buses = 15;

		if (cars > people )
			{
			System.out.println ( "Weh should take the cars. " );
			}
		else // If neither the above statements are true, the program will spit out the answer below
		{
		System.out.println ( "We can't decide." );
		}
		if ( cars < people ) // If the if statement above does not check out the program will try the else-if statement. 
			{
			System.out.println ( " We should not take the cars" );
			}
		
		if (buses > cars )
		{
		System.out.println ("That's too many buses. ");
		}
		else if (buses < cars )
		{
		System.out.println ("Maybe we could take the buses." );
		}
		else 
		{
		System.out.println ("We still can't decide." );
		}

		if (people > buses ) 
		{
		System.out.println ("All right, let's just take the buses" );
		}
		else 
		{
		System.out.println ("Fine, let's stay home then. " );
		}
}
}