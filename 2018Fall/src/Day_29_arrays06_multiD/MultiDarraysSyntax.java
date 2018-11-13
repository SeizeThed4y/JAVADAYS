package Day_29_arrays06_multiD;

import java.util.Arrays;

public class MultiDarraysSyntax {
	public static void main(String[] args) {
		
		
		double [] [] prices = new double [3][];
		
		prices[0] = new double [] {234.23 , 234.56, 788.45};
		prices[1] = new double [] {232.2 , 100.4};
		prices[2] = new double [5];
		
		
		
		prices[2][0] = 234.23;
		prices[2][1] = 5432;
		prices[2][2] = 123.34;
		prices[2][3] =  9234.23;
		prices[2][4] = 234.23;
		
		
		
		System.out.println(Arrays.toString(prices[0]));
		System.out.println(Arrays.toString(prices[1]));
		System.out.println(Arrays.toString(prices[2]));
		System.out.println(Arrays.deepToString(prices));
		
		
		
		
		
	}

}
