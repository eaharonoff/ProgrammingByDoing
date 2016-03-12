import java.util.Scanner;
public class ForgetfulMachine
{
	public static void main ( String [] args )
	{
		Scanner keyboard = new Scanner (System.in);


		System.out.print ("Give me a word!" );
		keyboard.next();
		System.out.print ("Give me a second word!" );
		keyboard.next();
		System.out.print ("Great, now what is your favorite number?" );
		keyboard.next();
		System.out.print ("And your second favorite?" );
		keyboard.next();
		System.out.println ("Jolly Good!");
	}
}