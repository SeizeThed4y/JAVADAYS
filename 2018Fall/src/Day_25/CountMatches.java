package Day_25;

public class CountMatches {
	public static void main(String[] args) {

		/*
		 * create a double array called prices
		 * 
		 * assign 10 or more different prices
		 * 
		 * 
		 * using a loop count how many items that is more than $20.
		 * 
		 * print the "count"
		 * 
		 * if no price was found that is more than $20 then print
		 * 
		 * "No items that cost more than $20
		 * 
		 */

		double[] prices = { 20.00, 4.00, 23, 44, 95.21, 12.43, 54.23, 43.85, 21.12, 45.32, 78.45 , 1};

		int count = 0;
		
		
		for ( double price : prices) {
			if(price > 20.0) {
				count++;
			}
			
			
		}
		if(count == 0) {
			System.out.println(count + " No items for more than $20");
		}
		System.out.println(count + " Item that cost than more than $20");
		
		
		
	}
}