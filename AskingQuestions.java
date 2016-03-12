import java.util.Scanner;
public class AskingQuestions
{
	public static void main ( String [] args )
	{
		Scanner keyboard = new Scanner (System.in); 

		int age, feet, inches;
		double weight;

		System.out.print ("How old are you? " );
		age= keyboard.nextint();
		System.out.print( "How many feet tall are you? " );
		feet= keyboard.nextint();
		System.out.print("And how many inches? ");
		inches= keyboard.nextint();
		System.out.printint( "How much do you weigh? " );
		weight= keyboard.nextdouble();
		System.out.println ("So you're " + age +" years old, " + feet + "'"+ inches + ""+ " feet tall," + " and weigh " + weight+"lbs.");
	}
}