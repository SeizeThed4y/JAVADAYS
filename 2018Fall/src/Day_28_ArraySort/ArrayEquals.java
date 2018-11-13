package Day_28_ArraySort;

import java.util.Arrays;

public class ArrayEquals {
	public static void main(String[] args) {

		// EQUALS method in arrays class
		// when 2 arrays with same lenth and same order of elements then they are "
		// Equal "

		int[] a = { 10, 20, 30 };
		int[] b = { 10, 20, 30 };
		int[] c = { 10, 20, 30, 40 };
		int[] d = { 10, 20, 40, 30 };
		
		

		System.out.println(Arrays.equals(a, b));

		System.out.println(Arrays.equals(b, c));

		System.out.println(Arrays.equals(c, d));
		
		//sort the d array and compare with c array
		
		Arrays.sort(d);
		
		System.out.println(Arrays.equals(c, d));

	}

}
