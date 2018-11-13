package Day_25;

import java.util.Scanner;

public class FindLargestInArray {
	public static void main(String[] args) {

		// ask user (Scanner) to enter how many item in array

		Scanner scan = new Scanner(System.in);

		System.out.println("How Many Item in Array");

		int count = scan.nextInt();

		// create array called nums with that capacity

		int[] nums = new int[count];

		for (int i = 0; i < count; i++) {
			System.out.println("Enter number");

			nums[i] = scan.nextInt();

			System.out.println("--------------");

			// print all items in same line using for each loop
		}
		System.out.print("The numbers are in the array");
		System.out.println("                        ");
		for (int n : nums) {
			
			System.out.print(n + " ");
		}
		System.out.println();
		
		System.out.println("-------------");
		
		
//		//iterate in array and find the largest value
//		int largest = nums[0];//assume that first one is the largest
//		//loop through the rest and check if they are greater than value of largest
//		//if true -> assign that value into largest.
//		//print out "largest: " + largest after the loop
		
		
		int largest = nums[0];
		
		for ( int num : nums) {
			
			
			if(num > largest) {
				largest = num;
			}
			if(largest > num) {
				largest = largest;
			}
			
			
			if(num == largest) {
				largest = num;
			}
			
			
		}
		System.out.println("The largest number is " + largest);
	}

}
