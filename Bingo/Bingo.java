/*Program Statement -
 * A game company has designed an online lottery game, Bingo. In this game, N number cards are displayed.
 * Each card has a value on it. The value can be negative or positive. The player must choose two cards. To win the game, the product of the values of the two cards must be maximum value possible for any pair of cards in the display.
 * The winning amount will be the sum of the to cards chosen by the player.
 * 
 * Write an algorithm to find the winning amount as the sum of the values of the two cards whose product value is maximum.
 * 
 * Input
 * The first line of the input consists of an integer numCards, representing the number of cards (N).
 * The second line consists of N space-separated integers - val1, val2,....,valN representing the values on the cards.
 * 
 * Output
 * Print an integer representing the sum of the values of the two cards whose product value is maximum.
 * 
 * Constraints
 * 0 <= numCards <= 10^6
 * -10^6 <= vali <= 10^6
 * 0 <= i <= numCards
 * 
 * Example
 * Input
 * 7
 * 9 -3 8 -6 -7 8 10
 * 
 * Output
 * 19*/

import java.util.Scanner;
public class Bingo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numCards = scan.nextInt(); //read input number of cards
		int[] cards = new int[numCards];  //declare an array to store the card values
		for(int i=0;i<numCards;i++) {
			cards[i] = scan.nextInt();  //read the card values
		}
		int maxProduct = 0; //integer to store the max product of 2 cards
		int card1=0,card2=0;  //two cards whose product is maximum of all
		//determine max product and then assign cards values to card1 and card2
		for(int i=0;i<numCards-1;i++) {
			for(int j=i+1;j<numCards;j++) {
				if(cards[i]*cards[j] > maxProduct) {
					maxProduct = cards[i] * cards[j];
					card1 = cards[i];
					card2 = cards[j];
				}
			}
		}
		//sum of 2 highest product giving cards
		int sum = card1 + card2;
		System.out.println(sum); //display output
	}
}
