/*Program Statement -
 * Andrew manages a pipe warehouse. He wishes to automate the process of transferring the pipes from the warehouse to the carrier truck.
 * There are N pipes in the warehouse placed vertically along a wall.
 * In the automated system, a drone picks the pipes by length and carries them to the carrier truck. In each turn, the drone moves from left to right to find the pipes whose lengths are greater than the pipe on their left.
 * After finding the pipe, the drone takes the pipe to the carrier truck. The drone repeats this process until it has no more pipes to pick.
 * 
 * Write an algorithm to output the list of pipes that will remain in the warehouse after the drone has completed this process.
 * 
 * Input
 * The first line of the the input consists of an integer numOfPipes
 * The second line of Input consists of length of the pipes
 * 
 * Constraints
 * 2 <= numOfPipes <= 10^5
 * 1 <= len[0],len[1],,...,len[N-1] <= 10^5
 * 
 * Example
 * Input
 * 5
 * 3 2 4 6 5
 * 
 * Output
 * 3 2
 * 
 * Explanation
 * In the first turn, the drone picks the pipe with length 4 as 4 > 2. So, the remaining pipes are 3,2,6 and 5.
 * In the next turn, the drone picks the pipe with length 6 as 6 > 2. So, the remaining pipes are 3,2 and 5.
 * In the next turn, the drone picks the pipe with length 5 as 5 > 2. So, the remaining pipes are 3 and 2.
 * Now there are no more pipes left which can be carried to the carrier truck. So, the remaining pipes in the warehouse are 3 and 2.*/

import java.util.Scanner;
public class Pipes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numOfPipes = scan.nextInt();
		//scan inputs
		int[] len = new int[numOfPipes];
		for(int i=0; i<numOfPipes; i++) {
			len[i] = scan.nextInt();
		}
		//print the first element of the array and consider it as a reference variable for comparing other elements
		System.out.print(len[0]+" ");
		int temp = len[0];
		//now we start iterating from index 1
		for(int i=1; i<numOfPipes; i++) {
			//if the ith element (right element) is less than the temp element (left element) then we display the element and set it as a reference element to compare the next right elements in the array
			if(len[i]<temp) {
				System.out.print(len[i]+" "); 
				temp = len[i];
			}
		}
	}
}
