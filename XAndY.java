import java.util.Scanner;
public class XAndY{
	public static void main(String[]args){
	Scanner keyboard=new Scanner(System.in);
	System.out.println("X"+"	"+"Y");
	System.out.println("--------------");
	for(double x=-10.0;x<=10.0;x=x+0.5){
		double y=x*x;
		System.out.println(x+"	"+ y);
	}
	}
}