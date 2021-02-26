/*Program Statement:
 * The NGO SaveEarth is planting trees on a straight highway road. For this purpose, they have divided the road into virtual blocks.
 * Each block is assigned a value that identifies the fertility value of the soil of the block. The fertility value can be positive or negative.
 * The NGO will plant the trees over the course of two days. The first block will be plowed on the first day and the second block will be plowed on the second day.
 * The third block will be plowed on the first day and the the fourth block will be plowed on the second day, and so on.
 * For the purpose of analysis, they wish to calculate the total fertility value of the blocks that are plowed each day. The total fertility value is calculated by adding the fertility values of all the blocks.
 * 
 * Write an algorithm to find the total fertility value of the blocks plowed on first day.
 * 
 * Input
 * The first line of the input consists of an integer numBlocks, representing the number of blocks (N).
 * The second line consists of N space-separated integers - fertilityValue1, fertilityValue2,.....,fertilityValueN representing the fertility value of the soil assigned to each block.
 * 
 * Output
 * Print an integer representing total fertility value of the blocks plowed on first day.
 * 
 * Constraints
 * 0 < = numBlocks < = 10^5
 * -10^6 < = fertility value < = 10^6
 * 1 < i < numBlocks
 * 
 * Testcase1:
 * Input:
 * 7
 * 2 -3 8 -6 -7 18 1
 * Output:
 * 4
 * Explanation:
 * 2+8+(-7)+1 = 11-7 = 4
 * */

import java.util.Scanner;
public class SaveEarth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numBlocks = scan.nextInt();
		int[] fertility_value = new int[numBlocks];
		for(int i=0; i<numBlocks; i++) {
			fertility_value[i] = scan.nextInt();
		}
		int total_fertility = 0;
		for(int i=0;i<numBlocks;i++) {
			if(i%2==0) {
				total_fertility += fertility_value[i];
			}
		}
		System.out.println(total_fertility);
	}
}
