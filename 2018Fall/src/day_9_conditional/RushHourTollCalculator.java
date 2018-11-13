package day_9_conditional;

import java.util.Scanner;

public class RushHourTollCalculator {

	public static void main(String[] args) {

		/*
		 * 
		 * 0 - 100 --> $5.00 101 - 500 --> $8 501 - 1000 --> $10 more than 1000 --> $12
		 * 
		 * rush hours : /*
		 * 
		 * 0 - 100 --> $10 101 - 500 --> $16 501 - 1000 --> $20 more than 1000 --> $24
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter How Many Miles You will drive");
		int miles = scan.nextInt();
		System.out.println("Is it Rush over True / False");
		boolean isRushHour = scan.nextBoolean();

		double tollCost = 0.0;

		if (miles > 0 && miles <= 100) {
			if (isRushHour == true) {
				tollCost = 10.0;
			} else {
				tollCost = 5.00;
			}
		} else if (miles >= 101 && miles <= 500) {
			if (isRushHour == true) {
				tollCost = 16.00;
			} else {
				tollCost = 8.00;
			}
		} else if (miles >= 501 && miles <= 1000) {
			if (isRushHour == true) {
				tollCost = 20.0;
			} else {
				tollCost = 10.0;
			}
		} else if (miles > 1000) {
			if (isRushHour == true) {
				tollCost = 24.0;
			} else {

			}
			tollCost = 12.0;
		} else {
			System.out.println("You cannot drive negative miles");
		}

		System.out.println("Toll Cost: " + tollCost);
		scan.close();
	}

}
