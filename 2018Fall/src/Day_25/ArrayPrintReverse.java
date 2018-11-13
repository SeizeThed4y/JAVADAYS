package Day_25;

public class ArrayPrintReverse {

	public static void main(String[] args) {
		/*
		 * create int array point and assign 10 different numbers
		 * 
		 * between 0 , 100
		 */
		
		
		int  [] points = {10,3,77,23,90,100,43,18,29,17};
		
		
		// check if 10 points and say 10 points found
		
		
//		if (points.length == 10) {
//			System.out.println("10 points found");
//		}else {
//			System.out.println("We need 10 points");
//		}
//		
		
		/*
		 * 1. using a for loop print each item in reverse order in same line 
		 * 
		 * , separated by space
		 * 
		 * 
		 * 2. using a while loop print each item in reverse order in same line 
		 * 
		 * , separated by space
		 */
		
		
		for (int i = points.length-1; i >= 0; i--) {
			
			System.out.print(points[i] + " ");
			
			i--;
		}
		
		System.out.println("\n -------While Loop----------" );
		
		int idx = points.length -1;
		
		while (idx >= 0) {
			
			System.out.print(points[idx] + " ");
			
			idx--;
			
		}
		
		
	}
	
}
