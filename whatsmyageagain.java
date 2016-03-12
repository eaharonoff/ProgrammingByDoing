import java.util.Scanner; 
public class whatsmyageagain
{
	public static void main ( String []args)
	{
		Scanner keyboard = new Scanner (System.in);

		int age,oldman;

		System.out.print ("What's your age again?" );
		age =keyboard.nextInt();

		oldman= age+990; 

		System.out.println("Wow. You old fuck. You're " + oldman + " That's peefed out man.");


	}
}