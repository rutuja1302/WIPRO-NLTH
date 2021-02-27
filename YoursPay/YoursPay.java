/*The new bank, "YoursPay" has a list of N customers' bank account balances.
 * The list consists of both positive and negative balances. The positive balance signifies the current year's customers and the negative balance signifies last year's customers.
 * The bank has decided to offer shortlisted customers credit scores to their credit cards. The credit score will be the sum of the two balances from the list with the smallest product when multiplied. 
 * If the credit score is positive then the credit will be provided to the current year's customer, otherwise it will go to the last year's customer.
 * 
 * Write an algorithm to find the credit score.​
 * 
 * Input
 * The first line of input consists of an integer - numCustomers, representing the number of banking customers (N).
 * The second line of input consists of N space separated integers - balance0, balance1,...balanceN-1 representing the customers bank balances.
 * 
 * Output
 * Print an integer representing the credit score.
 * 
 * Constraints
 * 2 <= numCustomers <= 10^9
 * -10^9 <= balancei <= 10^9
 * 0 <= i < numCustomers
 * 
 * Example
 * Input
 * 5
 * 1 8 -5 7 5
 * Output
 * 3
 * */

import java.util.Scanner;
public class YoursPay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numCustomers = scan.nextInt();
		int[] balance = new int[numCustomers];
		
		for(int i=0; i<numCustomers; i++) {
			balance[i] = scan.nextInt();
		}
		
		int product = 0;//smallest product
		int sum=0;  //sum of 2 balance values whose product is the smallest
		
		for(int i=0; i<numCustomers-1; i++) {
			for(int j=i+1; j<numCustomers; j++) {
				
				if(balance[i]*balance[j] < product) {
					product = balance[i] * balance[j];
					sum = balance[i] + balance[j];
				}
				
			}
		}
		
		//display output
		System.out.println(sum);
	}
}
