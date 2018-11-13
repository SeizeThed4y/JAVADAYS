package Day_33_Methods;

public class ConvertorUtilility {

	public static void main(String[] args) {

		mile2km(55);
		
		if(mile2km (55) < 100.0) {
			System.out.println("speed is good");
		}else  {
			System.out.println("Slow down");
		}
		
		
		
		
		/*
		 *		Unit tests for fahrenheitToCelcious method
		 *			#1
		 */
		
		
		
			int res = fahrenheitToCelcious(72);
			if (res == 22 ) {
				System.out.println("Test #1 pass");
			}else {
				System.out.println("Test #1 fail");
			}
			
			
			// Test #2
			
			int res2 = fahrenheitToCelcious(0);
			if (res2 == -17 ) {
				System.out.println("Test #2 pass");
			}else {
				System.out.println("Test #2 fail");
			}
		
	}
	
	
	
	//////////////////////
	
	
	
	
	

	/*
	 * Write a methid mile2km , accepts miles and return km value return type :
	 * double params: 1 double
	 * 
	 */

	public static double mile2km(double miles) {

		double km = 0;

		km = miles / 0.62137;

		// or

		// double kms = miles * 1.60934;

		System.out.println(miles + " Miles is: " + km + " km");

		return km;
	}
		
	
	
	
//	// you can call different method into another method
//	
//		public static double mile2kmV2(double miles) {
//
//			double kms = 	CalculatorVer2.multiply(miles, 1.60934);
//			return kms;
//		
//	}

	/*
	 * Method name : fahrenheitToCelcius Action : accepts F and turns C value
	 * 
	 */

	public static int fahrenheitToCelcious(int f) {
		

		return (f - 32) * 5 / 9;

		
	}

}
