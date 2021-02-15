/*An online book reading community's grid displays books in a specific format.
 * Only one batch of books is displayed at a time and each batch of books is recognized as a string tagged a-z.
 * Each character of the string denotes the initials of the book's author. The community has decided to change the format of the display grid but before they can do this, they need to know the number of unique author's initials present in the given batch of books.
 * The unique author's initials are the initials that appear only once in the batch of books represented as a string.
 * 
 * Write an algorithm to help the community find the count of unique author's initials present in the given batch of books.
 * 
 * Input
 * The input consists of a string - batch, representing the book batch on the display grid.
 * 
 * Output
 * Print an integer representing the count of the unique author's initials present in the given batch of books.
 * 
 * Note
 * The batch of books contains only the lowercase letters as the author name initial.
 * 
 * Example
 * Input
 * asfddagha
 * Output
 * 4
 * 
 * Explanation
 * There are 4 unique characters (s,f,g,h) present in the string. Hence the output is 4.*/

import java.util.Scanner;
public class UniqueAuthor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String authors = scan.next();  //read user input
		int unique=0;  //initialize result
		for(int i=0;i<authors.length()-1;i++) {
			int count = 0; //variable to hold the count of author's repeating names
			for(int j=0;j<authors.length();j++) {
				//if i==j that means it will count itself so we skip the loop if indexes are same for both the loop
				if(i==j)
					continue;
				if(authors.charAt(j)== authors.charAt(i))  //if author names are repeating the increment the count variable
					count++;
			}
			//if count variable is 0 that means the author's name is not repeated and hence it is a unique name
			if(count>0) {
				unique++;
			}
		}
		System.out.println(unique);  //print the output
	}
}
