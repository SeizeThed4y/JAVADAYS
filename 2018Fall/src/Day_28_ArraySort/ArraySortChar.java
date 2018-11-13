package Day_28_ArraySort;

import java.util.Arrays;

public class ArraySortChar {
	public static void main(String[] args) {
		char [] charArray = {'c' , 'C', 'D' , 'A', '2'};
		
		// In char numbers always first then Upper Case letters then Small Case
		
		
	
		
		Arrays.sort(charArray);
		
		 for (char c1 : charArray) {
			 System.out.print(c1 + " ");
		 }
	}

}
