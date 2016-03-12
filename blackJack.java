import java.util.Scanner;
import java.util.Random;
public class blackJack{
	public static void main(String[]args)
		throws InterruptedException 
		{
		Scanner keyboard = new Scanner (System.in);
		Random r = new Random();

		int deal_card_uno=2+r.nextInt(10);
		int deal_card_dos=2+r.nextInt(10);
		int dealer_hand=deal_card_uno+deal_card_dos;
		
		int player1_card_uno= 2+r.nextInt(10);
		int player1_card_dos= 2+r.nextInt(10);
		int player1_hand=player1_card_uno+player1_card_dos;


		System.out.println("Welcome to Emanuel's blackjack program!");
		System.out.println("Dealing in proccess...please wait");
		Thread.sleep(2000);
		System.out.println("Dealer deals you your first card. It is a "+ player1_card_uno);
		Thread.sleep(4000);
		System.out.println("Dealer takes a hidden card.");
		Thread.sleep(4000);
		System.out.println("Dealer deals you your second card which is a " + player1_card_dos);
		Thread.sleep(4000);
		System.out.println("You are showing a "+ player1_hand);
		Thread.sleep(4000);
		System.out.println("Dealer deals his second card which is a " + deal_card_dos);
		Thread.sleep(4000);
		System.out.println("Dealer is showing a " + deal_card_dos + " and a hidden card.");
			if(dealer_hand==21){
				System.out.println("Dealer has blackjack. You lose!");
				System.exit(0);
			}
		System.out.println("What would you like to do? hit or stay?");
		String hit_stay=keyboard.nextLine();
			if(hit_stay.equals("stay")){
				do{
						if(dealer_hand<=16){
							System.out.println("Dealer hits...");
							int next_card=2+r.nextInt(10);
							System.out.println("The dealer draws... ");
							System.out.println(next_card);
							Thread.sleep(3000);
							dealer_hand+=next_card;
							System.out.println("Dealer is showing "+dealer_hand);
							Thread.sleep(3000);
								if(dealer_hand>21){
									System.out.println("Dealer busts. You win!");
									System.exit(0);
								}
								else if (dealer_hand>16 && dealer_hand<21){
									System.out.println("Dealer stays at " +dealer_hand);
									break;
								}
								else if(dealer_hand==21){
									System.out.println("Dealer has blackjack. Dealer wins!");
									System.exit(0);
								}
						}	
						else if(dealer_hand>16 && dealer_hand<=21){
							System.out.println("Dealer Stays at "+dealer_hand);
							break;
						}
						else if(dealer_hand>21){
							System.out.println("Dealer busts! You win.");
							System.exit(0);
						}	
				}while(dealer_hand<=16);
			}
		else if(hit_stay.equals("hit")){
			do{
				int next_card=2+r.nextInt(10);
				System.out.println("You drew a " + next_card);
				player1_hand=player1_hand+next_card;
				System.out.println("You are showing " + player1_hand);
				Thread.sleep(300);
					if(player1_hand>21){
					System.out.println("Sorry. You bust. Dealer wins");
					System.exit(0); //exit program
					}
					else if(player1_hand<21){
						System.out.print("What would you like to do? hit or stay?");
						hit_stay=keyboard.nextLine();
						if(hit_stay.equals("stay")){
							Thread.sleep(300);
							break; //exit loop
						}	
					}
			}while(hit_stay.equals("hit") && player1_hand<21);
			
			if(dealer_hand>=17 && dealer_hand>=player1_hand){
				System.out.println("Dealer flips his hidden card and shows a "+deal_card_uno+".");
				System.out.println("Dealer has a " +dealer_hand+". Sorry, you lose.");
				System.exit(0);
			}
			if(dealer_hand<17){
				do{
					int next_card=2+r.nextInt(10);
					System.out.println("The dealer draws a "+next_card);
					dealer_hand=dealer_hand+next_card;
					Thread.sleep(300);
					System.out.println("Dealer is showing "+dealer_hand);
					Thread.sleep(300);
						if(dealer_hand>21){
							System.out.println("Dealer busts! You win.");
							System.exit(0);
						}
						else if(dealer_hand<=16){
							System.out.println("Dealer hits again...");
							Thread.sleep(3000);
						}
						else if(dealer_hand>16 && dealer_hand<21){
							System.out.println("Dealer Stays at "+dealer_hand);
						}
				}while(dealer_hand<=16);	
			}
		}
		if(dealer_hand>player1_hand && dealer_hand<=21){
			System.out.println("Dealer has a " +dealer_hand+". You have a " +player1_hand+". You lose!");
		}
		else if(dealer_hand==player1_hand){
			System.out.println("Dealer has a " + dealer_hand+". You have a "+player1_hand+". You push the dealer!");
		}
	}
}