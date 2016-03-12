import java.util.Scanner;

public class CountingWhile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
		System.out.println("How many times shall I say that?");
		int times = keyboard.nextInt();

		int n = 0;
		while ( n < times )
		{
			System.out.println( ((n+1)*10) + ". " + message );
			n++;
		}

	}
}