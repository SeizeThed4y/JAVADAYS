package Day_25;

import java.util.Scanner;

public class SearchInArray {

	public static void main(String[] args) {

		/*
		 * create array nums and assign 10 different numbers to it search for a number
		 * 100 in it using a loop, once found print the index location and
		 * "Value found at index" + index
		 * 
		 * if that search value is not found print "100 not found in the array"
		 * 
		 * once you find 100 then exit the loop at that point, we are looking for only
		 * first 100
		 * 
		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number you are looking for");
		int result = scan.nextInt();
		
		int[] nums = { 100, 2, 30, 45, 1250, 400, 76, 674, 2093 };

		//int result = 674;
		boolean found = false;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == result) {
				System.out.println(result + " Value found at index " + i);
				found = true;
				//break;

			}

		}
		if (found == false) {
			System.out.println(result + " Value not found at index"); // you have to write it outside the loop
		}
	}

}
