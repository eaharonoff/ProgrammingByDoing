import java.util.Scanner;
	public class AddingValuesForLoop{
		public static void main(String[]args){
			Scanner keyboard =new Scanner(System.in);

			System.out.println("Number: ");
			int number=keyboard.nextInt();
			int sum=0;

			for(int i=0;i<=number;i++){
				System.out.println(i+" ");
				sum+=i;
		}	 
		System.out.println("The sum is: " + sum);	
	}
}
