public class NumbersandMath
	{ public static void main ( String[] args)
	{
	//Prints out what is in between the quotations
	System.out.println ("I will now count my chickens");
	//prints out Hens and then divides 30 by 6 then adds 25
	System.out.println ("Hens " + (25.2 + 30.32 / 6.43));
	//prints out roosters and then does 25 x 3 divided by 4 and ONLY spews the remainder due to the modulus which is 3, then subtracts from 100
	System.out.println ( "Roosters " + ( 100- 25 * 3 % 4 ));

	System.out.println ( "Now I will count the eggs:");
	System.out.println ( 3 +2 +1 -5 + 4 % 2 - 1 / 4 + 6 );
	System.out.println ("Is it true that 3+2 < 5-7?");
	System.out.println ( 3 + 2 < 5-7 );
	System.out.println ("What is 3 + 2? " + ( 3 + 2 ) );
	System.out.println ("What is 5- 7? " + ( 5 -7 ) );
	System.out.println ("Oh that's why it's false." );
	System.out.println ( "How about some more.");
	System.out.println ( "Is it greater? " + (5 > -2 ));
	System.out.println ("Is it greater or equal? " + ( 5 >= -2 ));
	System.out.println ("Is it less or equal? " + (5 <= -2 ));
	System.out.println (7.0/4.0);
	System.out.println (7/4);
	}
	}