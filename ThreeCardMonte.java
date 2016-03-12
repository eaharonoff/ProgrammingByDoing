import java.util.Random;
import java.util.Scanner;
public class ThreeCardMonte{
	public void showCard(int cardNum){
		if (cardNum == 1){
		System.out.println("			" + "AA" + "	" + "##" + "	" + "##");
		System.out.println("			" + "AA" + "	" + "##" + "	" + "##");
		System.out.println("			" + "1"  + "	" + "2"  + "	" + "3");
	}
		
		else if (cardNum == 2){
		System.out.println("			" + "##" + "	" + "AA" + "	" + "##");
		System.out.println("			" + "##" + "	" + "AA" + "	" + "##");
		System.out.println("			" + "1"  + "	" + "2"  + "	" + "3");
		}
		else if (cardNum == 3){
		System.out.println("			" + "##" + "	" + "##" + "	" + "AA");
		System.out.println("			" + "##" + "	" + "##" + "	" + "AA");
		System.out.println("			" + "1"  + "	" + "2"  + "	" + "3");
		}
	
		else{
		System.out.println("what is you doin?");
	}

	}

	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int cardNumber = 1+ r.nextInt(3);
		String result = "";

		System.out.println("You slide up to fast eddie's card table and plop down your cash. ");
		System.out.println("HE glances at you out of the corner of his eye and starts shuffling");
		System.out.println("He lays down three cards.");
		System.out.println("Which one is the ace?");
		System.out.println("			" + "##" + "	" + "##" + "	" + "##");
		System.out.println("			" + "##" + "	" + "##" + "	" + "##");
		System.out.println("			" + "1"  + "	" + "2"  + "	" + "3");
		System.out.println("> ");
		int cardChoice = keyboard.nextInt();
		if (cardChoice == cardNumber)
		result = "You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.";
		else if (cardChoice != cardNumber)
		result = "Ha! Fast Eddie wins again! The ace was " + cardNumber;
		System.out.println(result);
	
		showCard(cardNumber);
		
	}
}