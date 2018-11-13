package day_9_conditional;

import java.util.Scanner;

public class ShippingCalculator {

	public static void main(String[] args) {

		/*
		 * price, distance, speed
		 * 
		 * 
		 * Regular Shipping rates: product price cost 1 - 100 17 101 - 300 10 300+ free
		 * 
		 * 
		 * Expres Shipping rates: product price cost 1-100 35 101 - 300 25 300+ 15
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Add the Price Of Product");
		double priceProduct = scan.nextDouble();
		System.out.println("Please Add Shipping Type Regular : False / Express : True");
		boolean shippingType = scan.nextBoolean();

		double costshipping = 0.0;

		if (priceProduct >= 1 && priceProduct <= 100) {
			if (shippingType == true) {
				costshipping = 35;
			} else {
				costshipping = 17;
			}
		} else if (priceProduct >= 101 && priceProduct <= 300) {
			if (shippingType == true) {
				costshipping = 25;
			} else {
				costshipping = 10;
			}
		} else if (priceProduct > 300) {
			if (shippingType == true) {
				costshipping = 15;
			} else {
				costshipping = 0;
				System.out.println("It is free");
			}
		}

		System.out.println(
				"your product price is: " + priceProduct + " dollars and the shipping cost is: " + costshipping);
		scan.close();
	}

}
