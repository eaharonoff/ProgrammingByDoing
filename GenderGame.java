import java.util.Scanner;
	public class GenderGame
	{
		public static void main (String [] args)
		{
			Scanner keyboard = new Scanner (System.in);
			System.out.println("What is your gender (M of F):");
			String gender = keyboard.next();
			System.out.println("First Name:");
			String firstName = keyboard.next();
			System.out.println("Last Name:");
			String lastName = keyboard.next();
			System.out.println("Age:");
			int age = keyboard.nextInt();
			if (gender.equals("F") && age >= 20)
			{
				System.out.println("Are you married, " + firstName + "(y or n)?");
				String married = keyboard.next();
				if (married.equals("y"))
				{
					System.out.println("Then I shall call you Mrs. " + lastName + ".");
				}
				else if (married.equals("n"))
				{
					System.out.println("Then I shall call you Ms. " + lastName + ".");
				}
				else
				{
					System.out.println ("I dun know!");
				}
			}
			else if (gender.equals("F") && age < 20)
			{
				System.out.println("Then I shall call you, " + firstName + " "+ lastName + ".");
			}
			else if (gender.equals("M") && age >= 20)
			{
				System.out.println("Then I shall call you, Mr. " + lastName + ".");
			}
			else if (gender.equals("M") && age < 20) 
			{
				System.out.println("Then I shall call you " + firstName + lastName +".");
			}

			
		}
	}