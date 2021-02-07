/*The e-commerce company "BuySellGoods" collected the sales value of N most popular selling products on its website.
 * From these values the company decides to calculate the total sales value of the two highest selling products.
 * 
 * Write an algorithm to help the company calculate the total sales value of the two highest selling products on its website.
 * 
 * Input
 * The first line of input consists of an integer- numProducts representing the total number of products (N).
 * The next line consists of N space-separated integers- saleValue[1], salesValue[2]....... saleValue[N],
 * representing the sales value of the N selected products.
 * 
 * Output
 * Print an integer representing the total sales value of the two highest selling products on the website.
 * 
 * Constraints
 * 2 <= numProducts <= 10^6
 * 
 * Note
 * More than one product can have a similar sales value.
 * 
 * Example
 * Input
 * 5
 * 15 26 13 7 45
 * 
 * Output
 * 71
 * 
 * Explanation
 * The two products with highest sales value are the second the fifth products. Hence the total sales value is 71 (26+45)
 * */

import java.util.Scanner;
public class BuySellGoods {
	public static void main(String[] args) {
		int res; //initialize variable to store the two products with highest sales valueresult
		Scanner scan = new Scanner(System.in);
		//read n 
		int numProducts = scan.nextInt();
		//initialiaze array of n integers representing the sales values
		int[] saleValue = new int[numProducts];
		//read the sales values from input
		for(int i=0;i<numProducts;i++) {
			saleValue[i] = scan.nextInt();
		}
		//sort the array to obtain the highest two values of sales
		int temp;
		for(int i=0;i<numProducts-1;i++) {
			for(int j=i;j<numProducts;j++) {
				if(saleValue[i]<saleValue[j]) {
					temp = saleValue[i];
					saleValue[i] = saleValue[j];
					saleValue[j] = temp;
				}
			}
		}
		res = saleValue[0] + saleValue[1];
		System.out.println(res);
	}
}
