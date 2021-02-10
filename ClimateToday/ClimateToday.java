/*"ClimateToday" is a media company that provides commercial weather forecasting services.
 * They have a list of temperatures of a particular location for N days and have already prepared
 * the forecast report within the range L to R where L is the minimum temperature and R is the maximum temperature from the given list.
 * Now, "ClimateToday" needs to know the temperature for the days that are not included within the range L to R.
 * 
 * Write an algorithm to help the company prepare the list of temperatures that are not included in the range L to R.
 * 
 * Input
 * The first line of input consists of three integers - days, minRange, maxRange
 * representing the number of days (N), the minimum temperature (L) and the maximum temperature (R).
 * The second line consists of N separated integers - temp1, temp2... temp N-1
 * representing the temperature of N days.
 * 
 * Output
 * Print space separated integers representing the list of temperatures that are not covered in the range L to R.
 * 
 * Constraints
 * 0 < days < 10^6
 * -10^6 < tempi < 10^6
 * 0 <= i < days
 * 
 * Note
 * Two days can have similar temperatures
 * 
 * Example
 * Input
 * 7 3 6
 * 2 5 1 8 6 9 4
 * 
 * Output
 * 2 1 8 9*/

import java.util.Scanner;
public class ClimateToday {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int days = scan.nextInt();
		int[] temp = new int[days];
		
		int min = scan.nextInt();
		int max = scan.nextInt();
		
		for(int i=0;i<days;i++) {
			temp[i] = scan.nextInt();
		}
		
		for(int i=0;i<days;i++) {
			if(temp[i]<min || temp[i]>max) {
				System.out.print(temp[i]+" ");
			}
		}
	}
}
