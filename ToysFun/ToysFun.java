/*The children's toy making company "ToysFun" is building cubic shaped learning toys.
 * The company has a list of N dimensions suggested by its designers for the toys that are perfect cube numbers. To do this, they need to know the total count of perfect cube numbers present in the list of dimensions.
 * 
 * Write an algorithm to help the toy manufacturers find the total count of perfect cube numbers present in the list of dimensions.
 * 
 * Input
 * The first line of input consists of an integer - numDimensions representing the total number of dimensions selected by the designers (N).
 * The second line of input consists of N space separated integers - dimens1, dimens2,....,dimensN-1 representing the value of the dimensions selected by the designers.
 * 
 * Output
 * Print an integer value representing the total count of the dimensions that are perfect cube numbers.
 * 
 * Constraints
 * 0 < numDimensions <= 10^6
 * 0 < dimens < 10^6
 * 0 <= i < numDimensions
 * 
 * Example
 * Input
 * 9
 * 23 1 8 56 27 67 64 125 232
 * 
 * Output 
 * 5*/

import java.util.Scanner;
public class ToysFun {
	//method to determine whether the dimension is a perfect cube or not.
	public static boolean dimens_is_cube(int n) {
		int i=1;
		boolean result = false;
		while(i<=n) {
			if(i*i*i == n) {
				result = true;
				break;
			}
			i++;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//read input
		int numDimensions = scan.nextInt();
		int[] dimens = new int[numDimensions];  //initialize an array to store dimensions
		for(int i=0;i<numDimensions;i++) {
			dimens[i] = scan.nextInt();
		}
		int perfect_cube = 0;  //initialize counter
		//determine whether the dimensions are a perfect cube, if yes then increment the counter
		for(int i=0;i<numDimensions;i++) {
			if(dimens_is_cube(dimens[i])) {
				perfect_cube++;
			}
		}
		System.out.println(perfect_cube);  //print result
	}
}
