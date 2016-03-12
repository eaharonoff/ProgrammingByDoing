import java.util.Scanner;
import java.util.Random;
public class NumberGuess{
	public static void main (String[] args){
	Scanner keyboard = new Scanner(System.in);
	Random r = new Random();
	int randomNumber = 1 + r.nextInt(100);
	int attempts = 0;
	System.out.println("I'm thinking of a number from 1 to 100");
	System.out.println("Your guess: ");
	int theGuess = keyboard.nextInt();
	attempts ++;
	while (theGuess != randomNumber && attempts < 7){
		attempts ++;
		if (theGuess < randomNumber) {
			System.out.println("Sorry you are too low!");
			System.out.println("Guess # " + attempts);
			}
		else if (theGuess > randomNumber){
			System.out.println("Sorry that guess is too high!");
			System.out.println("Guess # " + attempts);
			}
		theGuess = keyboard.nextInt();
		
		}
	if (theGuess != randomNumber){
		System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
		}
	else if (theGuess == randomNumber) {
		System.out.println("That's right! My secret number was " + randomNumber);
		System.out.println("It only took you " + attempts + " attempts to get it right! Not bad.");
		}
	}
}