package practicepublic;

import java.util.Scanner;

public class CommissionCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Amount of Sell You`ve Done");
		double yourSell = scan.nextDouble();

		System.out.println("Enter Daily Target");
		double target = scan.nextDouble();

		String performance = "";
		int bonus = 0;

		if (yourSell >= (target * 2)) {
			performance = "Excellent";
			bonus = 1000;
			System.out.println("Your Sell was: " + yourSell + " and your target was " + (target * 2)
					+ " and your performance was: " + performance + " with that you got " + bonus + " bonus!!");
		} else if (yourSell >= (target * 1.5)) {
			performance = "Fine";
			bonus = 500;
			System.out.println("Your Sell was: " + yourSell + " and your target was " + (target * 1.5)
					+ " and your performance was: " + performance + " with that you got " + bonus + " bonus!!");

		} else if (yourSell >= target) {
			performance = "SatisFactory";
			bonus = 100;
			System.out.println("Your Sell was: " + yourSell + " and your target was " + target
					+ " and your performance was: " + performance + " with that you got " + bonus + " bonus!!");
		} else {
			System.out.println("You are fired, Sales is not your business");
		}
		scan.close();

	}

}
