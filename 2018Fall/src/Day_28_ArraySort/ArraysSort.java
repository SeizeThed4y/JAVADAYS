package Day_28_ArraySort;

import java.util.Arrays;

public class ArraysSort {
	public static void main(String[] args) {

		int[] nums = { 1, 4, 6, 2, 8, 3, 5, -4};
		
		for ( int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		Arrays.sort(nums);
		
		

		for ( int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		
		
		
		

	}

}
