package practicepublic;

import java.util.Scanner;

public class SwitchStatementShippingCalculator {

	/*
	 * price, distance, speed
	 * 
	 * 
	 * Regular Shipping rates: product price cost 1 - 100 17 101 - 300 10 300+ free
	 * 
	 * 
	 * Express Shipping rates: product price cost 1-100 35 101 - 300 25 300+ 15
	 * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the Price Of Prduct");
		double priceProduct = scan.nextDouble();
		System.out.println("Do you want express or regular shippings ? Press E for Express , R for Regular");
		String shippingMode = scan.next();

		double shippingCost = 0;

		if (shippingMode.contains("E") || shippingMode.contains("e")) {
			if (priceProduct >= 1 && priceProduct <= 100) {
				shippingCost = 35;

			} else if (priceProduct >= 101 && priceProduct <= 300) {
				shippingCost = 25;

			} else if (priceProduct > 300) {
				shippingCost = 15;

			}
		} else if (shippingMode.contains("R") || shippingMode.contains("e")) { 

		if (priceProduct >= 1 && priceProduct <= 100) {
			shippingCost = 17;
			}else if(priceProduct >= 101 && priceProduct <= 300) {
			shippingCost = 10;	
			}else if(priceProduct > 300) {
				shippingCost = 0;
			}
		}
		
		
		System.out.println("Your shipping cost is: " + shippingCost);
		scan.close();
	}

}
