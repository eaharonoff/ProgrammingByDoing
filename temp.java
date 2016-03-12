import java.util.Scanner;
public class temp {
	public static void main ( String []args )
	 {
	 	Scanner keyboard = new Scanner (System.in);

	 double tempF, tempC;

	System.out.print ("What is the tempurature in farenheit? " );
	tempF= keyboard.nextDouble();

	tempC= (tempF -32) * (.5556); //this will convert the temp in farenheit to celcius, bro.

	System.out.println (" That mean's it is " + tempC + " in celcius. " );
		
}//MAIN
}//CLASSS