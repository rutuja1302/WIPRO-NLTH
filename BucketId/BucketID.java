/*Program Statement - 
 * A data company wishes to store its data files on the server. 
 * They wish to store N files. Each file has a particular size. 
 * The bucket ID is calculated as the sum of digits of its file size.
 * The server returns the bucket ID for every file request where the file is stored.
 * 
 * Write an algorithm to find the bucket IDs where the files are stored.
 * 
 * Input
 * The first line of the input consists of an integer numFiles representing the number of files to be stored (N).
 * The second line consists of N spaced separated integers - fileSize1, fileSize2,..., fileSizeN, representing the sizes of the files.
 * 
 * Output
 * Print N space-separated integers representing the bucket IDs for each file, respectively.
 * 
 * Constraints
 * 0 <= numFiles <= 10^6
 * 0 <= fileSizei <= 10^6
 * 0 <= i < numFiles
 * 
 * Example
 * Input:
 * 4
 * 43 345 20 987
 * 
 * Output
 * 7 12 2 24*/

import java.util.Scanner;
public class BucketID {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//read n
		int numFiles = scan.nextInt();
		//declare an array to store N files
		int[] fileSize = new int[numFiles];
		//read sizes of N files
		for(int i=0;i<numFiles;i++) {
			fileSize[i] = scan.nextInt();
		}
		//declare a variable to store result 
		int id;
		//create and display id for each file size by adding its digits
		for(int i=0; i<numFiles; i++) {
			id = 0; //initialize result id to zero
			//calculate sum of digits of each file size
			while(fileSize[i]>0) {  //loop will iterate until size of file is 0
				int temp = fileSize[i]%10; //returns the last digit
				id += temp;
				fileSize[i] /= 10;  //divides to eliminate the last digit of the number
			}
			System.out.print(id+" "); //print the result
		}
	}
}
