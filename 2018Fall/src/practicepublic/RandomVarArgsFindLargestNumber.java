package practicepublic;

import java.util.Arrays;

public class RandomVarArgsFindLargestNumber {
	public static void main(String[] args) {
		
		
		String email = "frk.coskunn@gmail.com";
		
		
		
		
		
		//findLargest(1,2,3,4,5,10,2,3);
		
		
		
		
		
	}
	
	
	
	public static void findLargest(int... nums) {
		
		int largest = nums [0];
		
		for(int i = 0; i < nums.length; i++) {
			if(largest < nums[i]) {
				largest = nums[i];
				
				
				
			}
		}
		System.out.println(largest);
	}

}
