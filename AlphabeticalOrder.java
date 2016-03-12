import java.util.Scanner;
public class AlphabeticalOrder{	
	public static void main (String[] args){

	Scanner keyboard = new Scanner (System.in);
	System.out.println("What's your last name?");
	String lastName = keyboard.next();

	if (lastName.compareTo("Carswell") < 0){
		System.out.println("You don't have to wait very long");
		}	
	else if(lastName.compareTo("Jones") < 0){
		System.out.println("that's not bad");
	}
	else if(lastName.compareTo("Smith") < 0){
		System.out.println("looks like a bit of a wait");
	}
	else if(lastName.compareTo("Young") < 0){
		System.out.println("it's going to be a while");
	}
	else if(lastName.compareTo("Jones") > 0){
		System.out.println("not going anywhere for a while?");
	}
	else{
		System.out.println("Woh");
	}
	}

}