import java.util.Scanner;
	public class TwentyQuestions
		{ //class
			public static void main ( String[] args )
			{//main
				Scanner keyboard = new Scanner (System.in);
				String fanswer , a1 , a2;


				System.out.println ("Two Questions!");
				System.out.println("Think of an object , and I will try to guess it.");
				System.out.println("Question 1) Is it animal, vegetable or mineral? ");
				a1 = keyboard.next();
				System.out.println ("Question 2) Is it bigger than a breadbox? ");
				a2 = keyboard.next();
				
				if ( a1.equals("animal") && a2.equals("yes") )
					{
						fanswer = "moose";
					}//moose
					
					else if ( a1.equals("animal") && a2.equals("no") )
						{
						fanswer = "mouse";
						}//mouse
							
							else 
							{
								if (a1.equals("vegetable") && a2.equals("yes"))
								{
									fanswer = "carrot";
								}
								else if (a1.equals("vegetable") && a2.equals("no"))
								{
									fanswer = " watermelon";
								}
								else 
								{
									if (a1.equals("mineral") && a2.equals("yes"))
									{
										fanswer = "Camaroe";
									}
									else if (a1.equals("mineral") && a2.equals("no"))
									{
										fanswer = "paper clip";
									}

									else 
									{
										fanswer = "your mom";
									}
								}
							}

									

								
							
					
				System.out.println("My guess is that you are thinking of a " + fanswer );
				System.out.println("I would ask you if I'm right, but I don't actually care.");
			}//main


		}//class
