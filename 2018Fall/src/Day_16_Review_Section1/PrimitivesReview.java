package Day_16_Review_Section1;

public class PrimitivesReview {

	public static void main(String[] args) {

		/*
		 * data types in java: 1. promitives 2. objects / class types / non - primitive
		 * 
		 * 
		 * 
		 * Primitives:
		 * 
		 * Wholenumbers / integer:
		 * 
		 * byte > short > int > long
		 * 
		 * Floating point numbers / numbers with decimals:
		 * 
		 * float > double
		 * 
		 * Char type:
		 * 
		 * Char is single character ,
		 * 
		 * 
		 * Boolean:
		 * 
		 * True / False
		 * 
		 * 
		 */

		byte chairs = 70;
		byte secondRoomChairs = 50;

		// first room has ___ chairs and second room has __ chairs __

		// there are __ chairs more in first room

		System.out.println("first room has " + chairs + " and second room has " + secondRoomChairs + "chairs\n"
				+ "there are " + (chairs - secondRoomChairs) + " more in first room");

		short shortValue = 32000;
		System.out.println("Short Value " + shortValue);

		int intValue = shortValue;
		// small can fit into large type. Implicit / automatic casting
		System.out.println(intValue);

		intValue = intValue * 100; // 32000000

		shortValue = (short) intValue;
		// explicit castin / converting

		System.out.println("Short after casting " + shortValue);

		int cityPopulation = 200_000_000;
		// underscores are allowed so that we can read easier.
		// compiler will ignore those
		// your number cannot start or end with underscore

		System.out.println(cityPopulation);

		long worldPopulation = 8_000_000_000l;
		System.out.println(worldPopulation);

		/*
		 * short shortnum = 500; byte buteNum = (byte) shortNum;
		 * 
		 */

		short shortNum = 500;
		byte byteNum = (byte) shortNum;

		System.out.println(byteNum);

		double price = 45.33, discount = 12.5;

		double total = price = discount=9.99;

		System.out.println(price);
		//int i = 10+100
		System.out.println(discount);
		System.out.println(total);
		
		
		

	}

}
