package Day_28_ArraySort;

public class ArrayHas55 {
	public static void main(String[] args) {

		// Given an array of ints, print true if the array contains a 5 next to a 5
		// anywhere in the array. If no consecutive 5s or no 5s are detected in your
		// code then print false.

		/*
		 * nums → [1, 5, 5, 1, 1] → true nums → [1, 8, 5, 5, 0] → true nums → [1, 5, 4,
		 * 1, 5] → false nums → [1, 4, 4, 1, 99] → false
		 */

		int[] nums = { 45, 15, 52, 5, 5 };
		
		

		// check if 5 and 5 are next to each other
		boolean found = false;
		
		for(int i = 0; i < nums.length -1 ; i++) {  // we need -1 because if the last number is the only 5 and it cannot check the next null element and it will break
			if( nums[i] == 5 && nums[i + 1 ] == 5) {
				found = true;
				break;
				
			}
		}
		
		System.out.println(found);
		
		
		//nums[i+1] --> if i is 1 , we are making it 2 and reading index 2 
	}

}
