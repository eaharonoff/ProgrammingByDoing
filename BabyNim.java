import java.util.Scanner;
public class BabyNim{
	public static void main(String[]args){
		Scanner keyboard=new Scanner(System.in);
		int a=3,b=3,c=3;
		System.out.println("A:3		B:3		C:3");
		while (a>0 || b>0 || c>0){
			System.out.println("Choose a pile:");
			String pile= keyboard.next();
			System.out.println("How many to remove from pile " + pile + ":");
			int removeCounter=keyboard.nextInt();
			nimGame(pile,removeCounter);
			if(pile.equals("a")|| pile.equals("A")){
				a-=removeCounter;
				System.out.println("A: "+a +" B: "+b+" C: "+c);
			}
			if(pile.equals("b") || pile.equals("B")){
				b-=removeCounter;
				System.out.println(" A: "+a+" B: "+b+" C: "+c);
			}
			if(pile.equals("c") || pile.equals("C")){
				c-=removeCounter;
				System.out.println(" A: "+a+" B: "+b+" C: "+c);
			}
		}
		System.out.println("All piles be empty dawg. Very Cool.");

		

	}
}