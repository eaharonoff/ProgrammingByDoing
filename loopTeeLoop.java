public class loopTeeLoop { 
	public static void main ( String [] args ) 
	{
		int playerhealth = 150 ; 
		int damage1 = 5;
		damage1 = multip(damage1);

		/*
		while ( playerhealth > 0 ) 
		
		{//while start
			playerhealth-=damage1;
			System.out.println ("Player 1 lost " + damage1 + " health points " + " and now has " + playerhealth + " health points left! " );
		}//while end

		System.out.println ("Weeeew...you know he dead...");
		*/


		int numberOfItems = 24;
		int itemCost = 5;
		int total = 0;


		for(int i=0; i<numberOfItems; i++)
		{//FOR Start
			
			total = total + itemCost;
			System.out.println(total);

		}//END LOOP



	}//main
public static int multip(int z) 
		{
			 return z * 10;

		}
}//class