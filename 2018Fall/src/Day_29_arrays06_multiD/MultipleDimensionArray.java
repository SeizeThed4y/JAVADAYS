package Day_29_arrays06_multiD;

import java.util.Arrays;

public class MultipleDimensionArray {

	public static void main(String[] args) {
	
		
		int [][] nums = new int [2][3]; 
		
		nums[0][0] = 10;
		nums[0][1] = 20;
		nums[0][2] = 30;
								//==>      (Same)      int nums [] [] = {{10,20,30} , {40,50,60}}       
		
		nums[1][0] = 40;
		nums[1][1] = 50;
		nums[1][2] = 60;
		
		
		
		
		
		
		//int [][] nums2 = {{10,60,30} , {40,20,90} , {70,80}};
		
		
		
		System.out.println(nums[0][0]);
		System.out.println(nums[0][2]);
		
		//reading length from 2d array:
		// find out how many 1 d arrays in 2d array:
		System.out.println("number of arrays: " + nums.length);
		
		//find out how many items in first array: index0
		
		System.out.println("number of values in first array " + nums[0].length);
		System.out.println("number of values in first array " + nums[1].length);
		
		
		System.out.println();
		
		
		
		
		int [][] nums2 = {{10,60,30} , {40,20,90} , {70,80}};
		
		
		
		
		
		System.out.println(nums2.length);
		System.out.println(nums2[0].length);
		System.out.println(nums2[2].length);
		
			
	}

}
