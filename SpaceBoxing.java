import java.util.Scanner;

public class SpaceBoxing
	{	public static void main ( String [] args) 
		{
			Scanner keyboard = new Scanner (System.in);
			System.out.println ( " Please enter your current earth weight: " );
			double earthWeight = keyboard.nextDouble();
			System.out.println ("I have information on the following planets: " );
			System.out.println (" 1. Venus" );
			System.out.println (" 2. Mars" );
			System.out.println (" 3. Jupiter");
			System.out.println (" 4. Saturn ");
			System.out.println (" 5. Uranus ");
			System.out.println (" 6. Neptune");
			System.out.println (" Which planet are you visiting? " );
			double pnum = keyboard.nextDouble();
			double pweight = gravity (earthWeight, pnum);

			System.out.println ("Your weight would be " + pweight + " on that planet. " );

		}


		public static double gravity ( double eWeight, double pnum2 ) 
		{
			if ( pnum2 == 1 )
				{
					return .78 * eWeight ;
				}
			else if ( pnum2 == 2 )
				{
				return .39 * eWeight ;
				}
			else if ( pnum2 == 3 )
			{
				return 2.65 * eWeight ;
			}
			else if ( pnum2 == 4 ) 
			{
				return 1.17 * eWeight ;
			}
			else if ( pnum2 == 5 ) 
			{
				return 1.05 * eWeight ;
			}
			else if ( pnum2 == 6 )
			{
				return 1.23 * eWeight ;
			}
			else 
			{
				return 0;
			}
		}
	}