package basic;

import java.util.Scanner;

public class FibonnaciApp {

	public static void main(String[] args) {
		int [] numbers = {0,1,2};
		
		
	System.out.println(" The average number of array is " + findavg(numbers));
		
		
	
	}
	
		public static int findavg (int [] arr) {
			int sum =0;// declare & define variable sum
			for (int a =0; a < arr.length; a++ ) {
			sum = sum + arr[a]; 
			
			// array length 1 sum = arr[0]
			//arr lenth = 2 sum = sum + arr [1]
			// arr length 3 sum = sum + arr [2]
			}
			return sum/(arr.length);
		}
			
}	
		
	



