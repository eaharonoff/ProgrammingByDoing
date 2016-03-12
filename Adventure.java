import java.util.Scanner;
	public class Adventure
		{
			public static void main ( String [] args )
			{	Scanner keyboard = new Scanner (System.in);
				System.out.println ("WELCOME TO EMANUEL'S TINY ADVENTURE! " );
				System.out.println ("You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"? ");
				String an1 = keyboard.next();
				if (an1.equals("kitchen"))
				{//if answer is kitchen...
					System.out.println (" There is a long countertop with dirty dishes everywhere. Off to one side there is, as you\'d expect , a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\". ");
					String kitchA = keyboard.next();
					if (kitchA.equals("refrigerator"))
						{//if answer is to look in refrigerator...
							System.out.println (" Inside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\") ");
							String food = keyboard.next();
							if (food.equals("yes"))
							{//if you want to look inside fridge...then
								System.out.println ("The smell is poison. You die.");
							}//answer to look inside fridge
							else 
							{//if you don't look in fridge
							System.out.println ("You die of starvation...eventually");
							}//don't look into fridge
						}//answer is refrigerator 
					else if (kitchA.equals("cabinet"))
					{//if you would like to look inside the cabinet
						System.out.println ("There is a rabies infested racoon sitting inside the cabinet. It looks like it wants to attack. Are you going to fight or run? (\"yes\" or \"no\") ");
						String fightrab = keyboard.next();
						if (fightrab.equals("yes"))
						{//choose to fight racoon with rabies
							System.out.println("The racoon calls his friends hiding in the cabinet and they maul you until you turn into a zombie");
						}//what happens if you fight the rabies racoon
						else 
						{//if you decide to run...
							System.out.println ("You ran for your life, found the door and narrowly escaped the rabies infested racoon! You learnt your lesson about entering haunted houses and never returned! ");
						}//ran from the racoon
					}//answer is cabinet
					else 
					{
						System.out.println ("Man. What is you doin? Way to mess up my game.");
					}
				}//answer is kitchen
				else if (an1.equals("upstairs"))
				{//if you choose to go upstairs...
					System.out.println (" Upstairs you see a hallway.  At the end of the hallway is the master \"bedroom\". There is also a \"bathroom\" off the hallway. Where would you like to go? ");
					String upAn = keyboard.next();
						if (upAn.equals("bedroom"))
						{//if you choose to check the bedroom...
							System.out.println(" You are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade. In the back of the room, the closet door is ajar. Would you like to open the door? (\"yes\" or \"no\") ");
							String closet = keyboard.next();
							if (closet.equals("yes"))
							{//if you decide to check the closet
								System.out.println ("You find old clothing and lint. You get bored and just leave the house unscathed.");
							}//checked the closet
							else 
							{//if you don't check the closet
								System.out.println (" Well, then I guess you'll never know what was in there. Thanks for playing, I'm tired of making nested if statements." );
							}//if you don't check the closet
						}//check bedroom
						else if (upAn.equals("bathroom"))
						{//bathroom check
							System.out.println ("You see something hanging behind the shower curtain but cannot tell what it is. Do you want to check it out? ");
							String shower = keyboard.next();
							if (shower.equals("yes"))
							{//yes to checking behind the curtain
								System.out.println ("Its a bag filled with $100 bills. You are filthy rich! ");
							}//yes to checking behind the curtain
							else 
							{//say no to checking behind curtain.
								System.out.println (" Well, then I guess you'll never know what was in there. Thanks for playing, I'm tired of making nested if statements. ");
							}//say no to checking behind curtain
						}//bathroom check
				}//answer is upstairs
				else 
				{
					System.out.println ("That is not an option assface! ");
				}
			}//main
		}//class