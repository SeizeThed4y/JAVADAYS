package Day_33_Methods;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethodsRandomNumber {

	public static void main(String[] args) {

		// System.out.println(Arrays.toString(getIntArray5()));

		System.out.println("the largest sum is " + sum());

	}

	/*
	 * Method: getIntArray5 params/args: noting return : int array
	 * 
	 * 
	 * 
	 * Creates an array with 5 ints and assigns random numbers,
	 * 
	 * between 0 - 100 then returns that array
	 * 
	 * 
	 * getIntArray5 --> [43,23,54,1,89]
	 * 
	 * 
	 */
	public static int[] getIntArray5() {

		Random rdm = new Random();
		int[] nums = new int[5];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rdm.nextInt(101);

		}

		return nums;

	}

	/*
	 * create 2 arrays using getIntArrays5 and compare sums of both and print out
	 * witch one is larger
	 */

	public static int sum() {
		int largest = 0;
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < getIntArray5().length; i++) {

			sum1 += getIntArray5()[i];
			sum2 += getIntArray5()[i];

		}
		System.out.println("Sum1 " + sum1);
		System.out.println("Sum2 " + sum2);
		if (sum1 > sum2) {
			largest = sum1;
		} else if (sum2 > sum1) {
			largest = sum2;
		} else {
			System.out.println("Sum of both arrays are equal");
		}
		return largest;

	}

}
