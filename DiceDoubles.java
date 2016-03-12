import java.util.Random;
public class DiceDoubles{
	public static void main (String [] args){
	Random r = new Random();
	int diceOne = 1 + r.nextInt(6);
	int diceTwo = 1 + r.nextInt(6);
	int total = diceOne + diceTwo;

	System.out.println("Here comes the dice!");
	System.out.println("Roll 1: " + diceOne);	
	System.out.println("Roll 2: " + diceTwo);
	System.out.println("The total is " + total + "!");

	while (diceOne != diceTwo){
		diceOne = 1 + r.nextInt(6);
		diceTwo = 1 + r.nextInt(6);
		total = diceOne + diceTwo;
		System.out.println("Roll 1: " + diceOne);	
		System.out.println("Roll 2: " + diceTwo);
		System.out.println("The total is " + total + "!");
		}
	}
}