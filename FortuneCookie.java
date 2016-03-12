import java.util.Random;
public class FortuneCookie{
	public static void main (String[] args){
		Random r = new Random();
		int cookieNumber = 1 + r.nextInt(6);
		int r1 = 1 + r.nextInt(54);
		int r2 = 1 + r.nextInt(54);
		int r3 = 1 + r.nextInt(54);
		int r4 = 1 + r.nextInt(54);
		int r5 = 1 + r.nextInt(54);
		int r6 = 1 + r.nextInt(54);
		String fortune = "";

		if (cookieNumber == 1)
			fortune = "You will be a peef for eternity.";
		else if (cookieNumber == 2)
			fortune = "You are bound to experience wew in your lifetime";
		else if (cookieNumber ==3)
			fortune = "There will be much woh and yo in your schemes";
		else if (cookieNumber == 4)
			fortune = "Stop eating so many damn fortune cookies. They be bad for you n shit";
		else if (cookieNumber == 5)
			fortune = "You will die. Eventually.";
		else if (cookieNumber == 6)
			fortune = "These don't actually mean anything. Live the life that is happening.";
		else 
			fortune = "May what da fuq?!";
		
		System.out.println(fortune);
		System.out.println("Your lucky numbers are: " + r1 + " - " + r2 + " - " + r3 + " - " + r4 + " - " + r5 + " - " + r6 );
	}
}