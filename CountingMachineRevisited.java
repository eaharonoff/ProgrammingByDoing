import java.util.Scanner;
public class CountingMachineRevisited{
	public static void main(String[]args){
	Scanner keyboard=new Scanner(System.in);
	System.out.println("Count from: ");
	int from=keyboard.nextInt();
	System.out.println("Count to: ");
	int to=keyboard.nextInt();
	System.out.println("Count by: ");
	int by=keyboard.nextInt();
	for(int n=from;n<=to;n=n+by){
		System.out.print(n+" ");
	}
	}
}