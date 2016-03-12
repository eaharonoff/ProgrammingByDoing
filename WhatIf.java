public class WhatIf
	{public static void main ( String []args )
	{
	int people=30;
	int cats=30;
	int dogs=15;

		if (people>cats)  {
		System.out.println ("Not many cats! The world is saved!");
		} //if the "if statement" is true, then the code within the brackets will run. If it is not true, it will not run the code below.
		if (people<cats) {
		System.out.println ("Too many cats! The world is doomed!" );
		}
		if (people<dogs) {
		System.out.println ("The world is drooled on" );
		}
		if (people>dogs) {
		System.out.println ("The world is dry! ");
		}
		dogs += 5;

		if (people>= dogs );
		{
		System.out.println( "People are greater than or equal to dogs." );
		}
		if ( people <= dogs )
		{
		System.out.println( "People are less than or equal to dogs" ) ; 
		}
		if ( people == dogs )
		{
		System.out.println (" People are dogs" );
		} 
	} 
}