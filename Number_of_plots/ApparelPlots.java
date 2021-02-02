/*Program Statement:
 * The garments company Apparel wishes to open outlets at various locations.
 * The company shortlisted several plots in these locations and wishes to select only plots that are square-shaped.
 * Write an algorithm to help Apparel find the number of plots that it can select for its outlets.
 * 
 * Input
 * The first line of the input consists of an integer numofPlots, representing the number of plots shortlisted by the company for outlets(N).
 * The second line consists of N space-separated integers - area1, area2...areaN representing the area of the N plots selected for outlets.
 * 
 * Output
 * Print an integer representing the number of plots that will be selected for outlets.
 * 
 * Constraints
 * 0 <= numOfPlots <= 10^6
 * 0 <= area <= 106
 * 0 <= i <= numOfPlots
 * 
 * Example
 * Input:
 * 8
 * 79 77 54 81 48 34 25 16
 * 
 * Output
 * 3
 * 
 * Explanation
 * The areas that are square form are 81,25,16. So, output is 3*/

import java.util.Scanner;
public class ApparelPlots {
	public static boolean isPerfectSquare(int n) {
		int i = 1;
		while(i*i<=n) {
			if((n%i == 0) && (n/i==i))
				return true;
			i++;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long numOfPlots = scan.nextLong();
		int[] area = new int[(int) numOfPlots];
		int count = 0;
		for(int i=0;i<numOfPlots;i++) {
			area[i] = scan.nextInt();
		}
		for(int i=0;i<numOfPlots;i++) {
			if(isPerfectSquare(area[i])) {
				count++;
			}
		}
		System.out.println(count);
	}
}
