import java.util.Scanner;
public class NoticingEvenNumbers{
	public static void main(String[]args){
	Scanner keyboard=new Scanner(System.in);
	for(int n=1;n<=20;n++){
		if(n%2==0){
			System.out.println(n+"<");
		}
		else if(n%2==1){
			System.out.println(n);
		}
	}
	}
}