package repliTPractice;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheUniqueNumber {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers");
		
	
		//int nums = scan.nextInt();
		
		
		int [] nums = {1, 1, 2, 3, 4,  4};
		for (int j = 0; j < nums.length; j++) {
	        int appearOnceNum =nums[j];
	        boolean duplicate = false;

	        for (int i = 0; i< nums.length; i++) {
	            if ( nums[i] ==appearOnceNum && j != i) {
	                duplicate = true;
	                break;
	            }

	        }
	        if (duplicate ==false) {
	            System.out.print( nums[j] + " ");
	        
	        }
	}

}
}
