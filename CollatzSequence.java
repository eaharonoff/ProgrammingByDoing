import java.util.Scanner;
public class CollatzSequence{
	public static void main(String[]args){
		Scanner keyboard = new Scanner(System.in);


		System.out.println("Start number: ");
		int number = keyboard.nextInt();
		System.out.print(number + "	");		
		while (number != 1){
			if(number%2==0){
				number = number/2;
			}
			else {
				number = (number*3)+1;
			}
			System.out.print(number+"	");
		}
		System.out.println("It works!");
	}
}