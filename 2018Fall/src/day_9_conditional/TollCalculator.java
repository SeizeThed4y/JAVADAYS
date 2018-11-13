package day_9_conditional;

import java.util.Scanner;

public class TollCalculator {

	public static void main(String[] args) {

		/*
		 * 
		 * 0 - 100 --> $5.00 101 -
		 *  500 --> $8 
		 * 501 - 1000 --> $10
		 * more than 1000 --> $12
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("~~ Toll Cost Calculator ~~");
		System.out.println("Enter How many miles , you will drive");
		int mile = scan.nextInt();
		int tollCost = 0;
		char coast = '$';

		if (mile >= 0 && mile <= 100) {

			tollCost = 5;
		} else if (mile >= 101 && mile <= 500) {
			tollCost = 8;
		} else if (mile >= 501 && mile <= 1000) {
			tollCost = 10;

		} else if (mile > 1000) {
			tollCost = 12;
		} else {
			System.out.println("Cannot be negative distance");
		}

		System.out.println(mile + " miles will cost you " + tollCost + coast);
		scan.close();
	}

}
  