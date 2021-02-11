/*You are provided with 3 numbers: input1, input2 and input3.
 * Each of these are four digit numbers within the range >= 1000 and <= 9999
 * i.e.
 * 1000 <= input1 <= 9999
 * 1000 <= input2 <= 9999
 * 1000 <= input3 <= 9999
 * You are expected to find the key using the below formula -
 * key = [SMALLEST digit in the thousands place of all three numbers][LARGEST digit in the hundreds place of all three numbers]
 *       [SMALLEST digit in the tens place of all three numbers][LARGEST digit in the units place of all three numbers]
 *       
 * Given three numbers, write an algorithm to find the key using the above mentioned formula.
 * 
 * Input
 * The input consists of three space-separated integers - input1, input2 and input3 representing the three four - digit numbers.
 * 
 * Output
 * Print an integer representing the concatenation of four digits where first digit represents the smallest digit in the thousands place of all three numbers;
 * second digit represents the largest digit in the hundreds place of all three numbers; third digit represents the smallest digit in the tens place of all three numbers and fourth digit represents the largest digit in the units place of all three numbers.
 * 
 * Example
 * Input:
 * 3521 2452 1352
 * Output:
 * 1522*/

import java.util.Scanner;
public class Key {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//read 3 input numbers
		int input1 = scan.nextInt();
		int input2 = scan.nextInt();
		int input3 = scan.nextInt();

		int result_key = 0;  //variable to store result
		int temp1,temp2,temp3;  //variables to store temp values
		int place = 1;  //variable to store places: 1=units 10=tens and so on
		
		while(input1!=0 && input2!=0 && input3!=0) {
			//temp variables to store the last digit of the given inputs
			temp1 = input1%10;
			temp2 = input2%10;
			temp3 = input3%10;
			
			//unit place
			if(place==1) {
				result_key = Math.max(temp1, Math.max(temp2, temp3));
				
			}
			//tens place
			if(place==10) {
				result_key = (Math.min(temp1, Math.min(temp2, temp3))*10) + result_key;

			}
			//hundreds place
			if(place==100) {
				result_key = (Math.max(temp1, Math.max(temp2, temp3))*100) + result_key;
			}
			//thousands place
			if(place==1000) {
				result_key = (Math.min(temp1, Math.min(temp2, temp3))*1000) + result_key;
				
			}
			
			//eliminate the last digit
			input1 /= 10;
			input2 /= 10;
			input3 /= 10; 
			place *= 10;  //upgrade the place counter
		}
		System.out.println(result_key);  //display the output
	}
}
