import java.util.Scanner;
	public class Quiz 
		{	
			public static void main ( String []args )
				{
					Scanner keyboard = new Scanner (System.in);

					System.out.println ("Are you ready for a quiz? " ) ;
					keyboard.next();
					System.out.println ("OK. Here it comes! " ) ;
					System.out.println ("Q1) What is the capital of Alaska? " );
					System.out.println (	"1) Melbourne " );
					System.out.println (	"2) Anchorage " );
					System.out.println (	"3) Juneau " );
					int a1 = keyboard.nextInt();
						if ( a1 == 3 )
						{ 
							System.out.println ("That's correct! ") ;
						}

						else if ( a1 == 1 )
						{
							System.out.println ("Sorry, Melbourne is not the capital of Alaska " );
						}

						else if ( a1 == 2 )
						{
							System.out.println ("Sorry, Anchorage is not the capital of Alaska" );
						}
						else 
							System.out.println ("That is not a choice! ");

					System.out.println ( "Q2) Can you store the value cat in a variable of type int? " );
					System.out.println (" 1) Yes " );
					System.out.println (" 2) No " );
					int a2 = keyboard.nextInt();
						if ( a2 == 1 )
						{
							System.out.println ("Sorry, cat is a string. Ints can only store numbers! ");
						}
						else if ( a2 == 2 )
						{
							System.out.println (" That's correct! Ints can only store numbers! "); 
						}
						else 
						{
							System.out.println ("That is not a choice my friend! ");
						}
					System.out.println ("Q3) What is the result of 9+6/3 ? ");
					System.out.println ("1) 5");
					System.out.println ("2) 11");
					System.out.println ("3) 15/3");
					int a3 = keyboard.nextInt();
						if (a3 == 1 )
						{
							System.out.println ("Sorry that is not the right answer! ");
						}
						else if (a3 == 2 )
						{
							System.out.println (" That is correct! " );
						}
						else if ( a3 == 3) 
						{
							System.out.println (" Sorry that is not the right answer! " );
						}
						else 
						{
							System.out.println ("That is not a choice my friend! " );
						}

					int total1 = score1 (a1);
					int total2 = score2 (a2);
					int total3 = score3 (a3);
					int finalscore = total1 + total2 + total3;

					System.out.println ("Your score is " + finalscore + " out of 3 " );
				}

			public static int score1 ( int ans1) 
			{
				if ( ans1 == 3 )
				{
					return 1;
				}
				return 0;
			}

			public static int score2 (int ans2)
			{
				if (ans2 == 2)
				{
					return 1;
				}
				return 0;
			}
			public static int score3 (int ans3)
			{
				if (ans3 == 2)
				{
					return 1;
				}
				return 0;
			}

		}