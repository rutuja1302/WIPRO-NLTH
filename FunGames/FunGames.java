/*The games development company "FunGames" has developed a balloon shooter game. The balloons are arranged in a linear sequence and each balloon has a number associated with it.
 * The numbers on the balloons are in fibonacci series. In the game the player shots 'k' balloons. The player's score is the sum of the numbers on the 'k' balloons.
 * 
 * Write an algorithm to generate the player's score.
 * 
 * Input
 * The input consists of an integer - numBalloons representing the total number of balloons shot by the player(k).
 * Output
 * Print an integer value representing the player's score. If no balloons are shot then print 0.
 * 
 * Constraints
 * 0 <= numBalloons <= 10^6
 * 
 * Example
 * Input
 * 7
 * Output
 * 20
 * 
 * Explanation 
 * The fibonacci sum is 0+1+1+2+3+5+8=20*/

import java.util.Scanner;
public class FunGames {
	//method to generate fibonacci series of n number of balloons and return the sum of the series
	public static int fibo(int n) {
		int[] fibs = new int[n];  //fibonacci series array
		//first two elements of fibonacci series initialization
		fibs[0] = 0;
		fibs[1] = 1;
		int sum=0; //initializing sum variable to store the sum of the series
		//nth element of fibo series = sum of its previous two elements
		for(int i=2;i<n;i++) {
			fibs[i] = fibs[i-1]+fibs[i-2];
		}
		//calculate the sum
		for(int i=0;i<n;i++) {
			sum += fibs[i];
		}
		return sum; 
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//read input
		int numBalloons = scan.nextInt();
		int result = fibo(numBalloons); //call a function to generate fibonacci series and return the sum
		System.out.println(result);  //print output
	}
}
