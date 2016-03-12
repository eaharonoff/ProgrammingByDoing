public class babyBlackJack{
	public static void main(String[]args){
		int[] player1 = {6,5};
		int[] dealer = {7,3};
		int sum = player1[0]+player1[1];
		int dealer_sum=dealer[0]+dealer[1];

		System.out.println("You drew "+ player1[0]+" and" + player1[1]+".");
		System.out.println("Your total is " + sum + ".");

		System.out.println("The dealer drew " + dealer[0]+" and"+ dealer[1]);
		System.out.println("Dealer's total is " + dealer_sum+".");

		if(sum>dealer_sum){
			System.out.println("You win!");
		}
		else{
			System.out.println("You lose. Sorry.");
		}
	}
}