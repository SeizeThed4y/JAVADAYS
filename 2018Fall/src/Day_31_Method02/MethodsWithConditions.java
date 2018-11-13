package Day_31_Method02;

import java.util.Arrays;

public class MethodsWithConditions {
	public static void main(String[] args) {

		

		getLarger(2, 5);

		// Assign array into the method
		
		
		// 1st way longer way
		//int[] nums = { 100, 300, 200 };
		//getMax(nums);
		
		
		// 2nd shorter way
		getMax(new int[] { 123, 43, 123, 7547, 1, 2, 3, 66666 });

		
		
		
		
		steps(-3);

	}
	
	/*
	 * create a method getLarger that accepts 2 numbers and prints larger one
	 * 
	 * if they are equal it prints "Numbers are equal : " + number
	 */

	public static void getLarger(int num1, int num2) {

		int largest = 0;

		if (num1 > num2) {
			largest = num1;
		} else if (num2 > num1) {
			largest = num2;
		} else {
			System.out.println("Numbers are equal " + num1);
		}

		System.out.println("the largest number is: " + largest);

	}

	/*
	 * create a method getMax - that accepts and int Array and prints largest number
	 * in the array
	 * 
	 * 
	 * 
	 */

	public static void getMax(int[] nums) {

		// If array is empty, print: "Error"

		if (nums.length == 0) {
			System.out.println("Error : Array is empty!!");
			return;
		}

		Arrays.sort(nums);

		System.out.println(nums[nums.length - 1]);

	}

	/*
	 * create a method Steps, it accepts an int parameter
	 * 
	 * if the parameter is "Negative" print : "jump " that many times
	 * 
	 * example: int = -2 jump 1 jump 2
	 * 
	 * if parameter is 0 then we sit print " sit "
	 * 
	 * if it is positive we take steps: step 1 step 2 ...
	 */

	public static void steps(int times) {

		if (times == 0) {
			System.out.println("sit");
		} else if (times > 0) {
			for (int i = 1; i < times; i++) {

				System.out.println("Step " + i);

			}
		} else if (times < 0) {
			for (int j = 1; j <= times * (-1); j++) {
				System.out.println("Jump " + j);

			}
		}

	}

}
