/*Program Statement:
 * The cosmetic company "BeautifyMe" wishes to know the alphabetic product code from the barcode. The barcode of the product is a numeric value and the alphabetic product is a string value tagged 'a-j'.
 * The alphabetic range 'a-j' represents the numeric range '0-9'. To produce the alphabetic product code, each digit in the numeric barcode is replaced by the corresponding matching letters.
 * Write an algorithm to display the alphabetic product code from the numeric barcode.
 * 
 * Input
 * The input consists of an integer - barcode, that represents the barcode of the product.
 * 
 * Output
 * Print a string representing the alphabetic product code.
 * 
 * Constraints
 * 0 <= barcode <= 10^10
 * 
 * Example
 * Input
 * 12403
 * 
 * Output
 * bcead
 * 
 * Explanation
 * The corresponding letters for the numeric barcode 12403 is 'bcead'*/

import java.util.Scanner;
public class BeautifyMe {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Long barcode = scan.nextLong();  //read input barcode from user
		char[] alphabets = {'a','b','c','d','e','f','g','h','i','j'}; //aplhabets representing numbers from 0-9
		String result = ""; //string to store result
		while(barcode>0) {
			int rem = (int) (barcode%10);  //returns last digit
			result = alphabets[rem] + result;  //returns the string with alphabet representing int rem & previous result 
			barcode = barcode/10; //returns the remaining digits
		}
		System.out.println(result);  //displaying result
	}
}
