import java.util.Scanner ;
public class AreYouLegal
{ //Main
	public static void main ( String [] args )
	{ // program
		Scanner keyboard = new Scanner (System.in);

		int age; //I will be asking the age of the person
		String name; // And I will also ask for that person's name

		System.out.print ("Hey, what's your name? "); //First I ask for the person's name.
		name = keyboard.next(); //This will store whatever String the perons enters as the name
		System.out.print ("OK, " + name + " how old are you? "); // The program will now ask that person their age
		age = keyboard.nextInt(); // the program will store whatever integer the person will enter as his/her age

		if (age < 16 ) // if the person is less than 16 the program will display what is between the curly brackets
		{
			System.out.println ("You can't drive, " + name + "!" );
		}

		if (age < 18 ) // if the person is less than 18 yrs old the program will display the text in btwn the curly brackets below it 
		{
			System.out.println ("You can't vote, " + name + "!");
		}
		if (age < 25 ) // if the person is less than 25 yrs old the program will display the text in btwn the curly brackets below it
		{
			System.out.println ("You can't rent a car, " + name + "!");
		}
		if ( age >= 25 ) // if the person is 25 or older, the program will display the text in the curly brackets directly below
		{
			System.out.println ("You can do anything that is legal, " + name +"!");
		}

	} // program 
}// Main