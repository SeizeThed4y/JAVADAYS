package Day_28_ArraySort;

public class ArrayCountEvenNumbers {
	public static void main(String[] args) {
		//Given an array nums, calculate count of even numbers in nums and print out to console.
		
				/*nums → [2, 1, 2, 3, 4]) → 3
				nums → [2, 2, 0, 3, 5]) → 3
				nums → [1, 3, 5, 7, 9]) → 0*/
		
		
		
		int [] nums = {2 , 1 , 2 , 3 , 4};
		int counter2 = 0;
		
		for (int i  = 0; i < nums.length; i ++) {
			
			if(nums[i] % 2 == 0 ) {
				counter2++;
			}
			
		}
		System.out.println(counter2);
		
		
		System.out.println( " ~~~~~ For Each Loop ~~~~~~~~");
		
		 int counter = 0;
		for(int n : nums) {
			if(n % 2 == 0 ) {
				counter++;
			}
			
		}
		System.out.println(counter);
	}

}
