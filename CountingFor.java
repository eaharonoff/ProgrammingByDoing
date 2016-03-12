import java.util.Scanner;
public class CountingFor{
		public static void main(String[]args){
			Scanner keyboard = new Scanner(System.in);

			System.out.println("Type in a message, and I'll display it five times");
			System.out.println("Message: ");
			String message=keyboard.nextLine();

			for(int i=2; i<=10;i=i+2){
				System.out.println(i+"."+message);
			}

		}
}
