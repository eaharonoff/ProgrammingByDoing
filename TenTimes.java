import java.util.Scanner;
public class TenTimes{
	public static void main (String[]args){
		Scanner keyboard=new Scanner(System.in);
		String phrase="Mr. Mitchell is cool";
		for(int n=1;n<=10;n++){
			System.out.println(n+"."+phrase);
		}
	}
}