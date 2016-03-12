import java.util.Scanner;
	public class TwoMoreQuestions 
	 {
	 	public static void main ( String [] args )
	 	{	Scanner keyboard = new Scanner (System.in);
	 		System.out.println ("Two more questions baby! ");
	 		System.out.println ("Think of something and I'll try to guess it! "); 
	 		System.out.println (" 1) Does it stay inside, outside, or both? " );
	 		String a1 = keyboard.next();
	 		System.out.println ("Question 2) Is it alive? " );
	 		String a2 = keyboard.next();
	 		
	 		if ( a1.equals("inside ") && a2.equals("yes"))
	 		{
	 			System.out.println ("houseplant");
	 		}

	 		if (a1.equals("inside") && a2.equals ("no"))
	 		{
	 			System.out.println ("Shower curtain");
	 		}

	 		if (a1.equals("outside") && a2.equals("yes"))
	 		{
	 			System.out.println ("bison");
	 		}
	 		if (a1.equals("outside") && a2.equals("no"))
	 		{
	 			System.out.println ("billboard");
	 		}
	 		if (a1.equals("both") && a2.equals("yes"))
	 		{
	 			System.out.println ("dog");
	 		}
	 		if (a1.equals("both") && a2.equals("no"))
	 		{
	 			System.out.println ("cell phone");
	 		}
	 	}//main
	 }//class