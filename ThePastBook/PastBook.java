/*Program Statement:
 * To create a profile on a social media account "ThePastBook", the user needs to enter a string value in the form of username.
 * The username should consists of only characters tagged a-z.
 * If the user enters an incorrect string containing digits the system automatically identifies the number of digits in the string and removes them.
 * 
 * Write an algorithm to help the system identify the count of digits present in the username.
 * 
 * Input
 * The input consists of a string- userName, representing the user name.
 * 
 * Output
 * Print an integer representing the total count of digits present in the username. If no digits are present output 0.
 * 
 * Example
 * Input
 * rah23ul
 * Output
 * 2
 * 
 * Explanation
 * There are two digits in the username, '2' and '3',the total count of digits are two(2).
 * Hence 2 is the output*/

import java.util.Scanner;
public class PastBook {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName = scan.nextLine();  //read input
		int count = 0;  //initialize counter variable
		int len = userName.length();  //length of the string
		//iterate through the string, if charAt any index is a digit increment the counter variable
		for(int i=0;i<len;i++) {  
			if(userName.charAt(i)=='0' || userName.charAt(i)=='1' || userName.charAt(i)=='2' ||
					userName.charAt(i)=='3' || userName.charAt(i)=='4' || userName.charAt(i)=='5' ||
					userName.charAt(i)=='6' || userName.charAt(i)=='7' || userName.charAt(i)=='8' || userName.charAt(i)=='9') {
				count++;
			}
		}
		System.out.println(count);  //print the output
	}
}
