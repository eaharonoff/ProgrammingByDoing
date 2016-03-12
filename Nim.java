import java.util.Scanner;

	public class Nim{


		public static void main(String[]args){
			Scanner keyboard=new Scanner (System.in);
			int counterA=5, counterB=4, counterC=3;
			int turn=1;

			System.out.println("Player 1, enter your name: ");
			String player1=keyboard.next();
			System.out.println("Player 2, enter your name: ");
			String player2=keyboard.next();
			System.out.println("A: "+counterA+" B: "+counterB+" C: "+counterC);

			do{
				if(turn %2==1){
					System.out.println(player1+", choose a pile:");
					String pileChosen=keyboard.next();
					while(pileChosen.equals("A") && counterA==0 || pileChosen.equals("B") && counterB==0 || pileChosen.equals("C") && counterC==0){
						System.out.println("Nice try,"+player1+"."+pileChosen+" is empty. Choose again:");
						pileChosen=keyboard.next();
					}
					System.out.println("How many cards will be removed from "+pileChosen+":");
					int removeFromCounter=keyboard.nextInt();
					while(pileChosen.equals("A") && removeFromCounter>counterA || pileChosen.equals("B") && removeFromCounter>counterB || pileChosen.equals("C") && removeFromCounter>counterC ||removeFromCounter<0){
						System.out.println("Pile "+pileChosen+" doesn't have that many. Try again:");
						removeFromCounter=keyboard.nextInt();
					}
					while(pileChosen.equals("A") && removeFromCounter<=0 || pileChosen.equals("B") && removeFromCounter<=0 || pileChosen.equals("C") && removeFromCounter<0){
						System.out.println("You must choose at least 1. How many?");
						removeFromCounter=keyboard.nextInt();
					}

					if(pileChosen.equals("A") && counterA>0){
						counterA-=removeFromCounter;
					}//if pile chosen is A
					else if(pileChosen.equals("B") && counterB>0){
						counterB-=removeFromCounter;
					}
					else if(pileChosen.equals("C") && counterC>0){
						counterC-=removeFromCounter;
					}
					System.out.println("A:"+counterA+" B:"+counterB+" C:"+counterC);
				}//if player 1's turn
				else if (turn%2==0){
					System.out.println(player2+", choose a pile:");
					String pileChosen=keyboard.next();
					while(pileChosen.equals("A") && counterA==0){
						System.out.println("Nice try,"+player2+"."+pileChosen+" is empty. Choose again:");
						pileChosen=keyboard.next();
					}
					while(pileChosen.equals("B") && counterB==0){
						System.out.println("Nice try,"+player2+"."+pileChosen+" is empty. Choose again:");
						pileChosen=keyboard.next();
					}
					while(pileChosen.equals("C") && counterC==0){
						System.out.println("Nice try,"+player2+"."+pileChosen+" is empty. Choose again:");
						pileChosen=keyboard.next();
					}
					System.out.println("How many cards will be removed from "+pileChosen+":");
					int removeFromCounter=keyboard.nextInt();
					while(pileChosen.equals("A") && removeFromCounter>counterA){
						System.out.println("Pile "+pileChosen+" doesn't have that many. Try again:");
						removeFromCounter=keyboard.nextInt();
					}
					while(pileChosen.equals("B") && removeFromCounter>counterB){
						System.out.println("Pile "+pileChosen+" doesn't have that many. Try again:");
						removeFromCounter=keyboard.nextInt();
					}
					while(pileChosen.equals("C") && removeFromCounter>counterC){
						System.out.println("Pile "+pileChosen+" doesn't have that many. Try again:");
					}
					if(pileChosen.equals("A") && counterA>0){
						counterA-=removeFromCounter;
					}//if pile chosen is A
					else if(pileChosen.equals("B") && counterB>0){
						counterB-=removeFromCounter;
					}
					else if(pileChosen.equals("C") && counterC>0){
						counterC-=removeFromCounter;
					}
					System.out.println("A:"+counterA+" B:"+counterB+" C:"+counterC);
				}//if player 2's turn
				turn++;
			} while(counterA>1 || counterB>1 ||counterC>1);
			if(turn%2==1){
				System.out.println(player1+", there is only one counter left! You have to take the last card. And lose!");
			}
			else if(turn%2==0){
				System.out.println(player2+", there is only one counter left! You have to take the last card.And lose!");
			}
		}//main
	}//class