import java.util.Scanner;
public class Adventure_2{
	public static void main (String[]args){
		Scanner keyboard = new Scanner(System.in);
		int nextDoor=1;
		String choice="";
		while (nextDoor!=0){
			if (nextDoor==1){
				System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\" ?");
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if(choice.equals("upstairs")){
					nextDoor=2;
				}
				else if (choice.equals("kitchen")){
					nextDoor=3;
				}
				else{
					System.out.println("Mayn wuht iz you doin?");
				}
			}	
			if(nextDoor==2){
				System.out.println("Upstairs you see a hallway. At the end of the hallway is the master");
				System.out.println("\"bedroom\". Ther eis also a \"bathroom\" off the hallway. Or, you can");
				System.out.println("go back \"downstairs\". Where would you like to go? ");
				System.out.print(">");
				choice = keyboard.nextLine();
				if(choice.equals("downstairs")){
					nextDoor=1;
				}
				if (choice.equals("bedroom")){
					nextDoor=4;
				}
				if (choice.equals("bathroom")){
					nextDoor=5;
				}
			}
			if(nextDoor==3){
				System.out.println("There is a long countertop with dirt dishes everywhere. Off to one side");
				System.out.println("ther is, as you'd expect, a refridgerator. You may open \"refridgerator\" or");
				System.out.println("go \"back\".");
				System.out.print(">");
				choice=keyboard.nextLine();
				if(choice.equals("refridgerator")){
					System.out.println("Inside the refridgerator you see food and stuff. It looks grimey.");
					System.out.println("Would you like to eat some? \"Yes\" or \"No\"?");
					System.out.print(">");
					choice=keyboard.nextLine();
					if(choice.equals("Yes") || choice.equals("yes")){
						System.out.println("The food is slimy and foul. but you choke it down. And die.");
						nextDoor=0;
					}//eat food>end game
					else if (choice.equals("No") || choice.equals("no")){
						System.out.println("Smart decision. You walk away unscathed.");
						nextDoor=3;
					}//decide not to eat
					if(choice.equals("back")){
						nextDoor=1;
					}//back to beginning
				}//fridge option
			}//kitchen door 3
			if(nextDoor==4){
				System.out.println("You go into the bedroom. You see a witch at the desk and she is doing her makeup.");
				System.out.println("As she turns around she asks if you would like to give her a kiss.");
				System.out.println("Will you kiss her? \"Yes\" or \"No\"?");
				System.out.print(">");
				choice=keyboard.nextLine();
				if(choice.equals("Yes") || choice.equals("yes")){
					System.out.println("She grabs you by the waist...slowly brings her lips to yours");
					System.out.println("Upon contact with her lips you fall to the floor. unconscious and become her prisoner.");
					nextDoor=0;
				}//say yes to witch
				else if(choice.equals("No") || choice.equals("no")){
					System.out.println("Smart move. She lets you leave. You decide you had enough adventure for a day.");
					System.out.println("You finally leave the house.");
					nextDoor=0;
				}//say no to witch
			}//if bedroom
			if(nextDoor==5){
				System.out.println("I'm bored. Your bored. You take a piss. Flush. And walk out.");
				nextDoor=0;
			}//if bathroom
		}//while loop
	System.out.println("Game over. Bye...");
	}//main
}//class