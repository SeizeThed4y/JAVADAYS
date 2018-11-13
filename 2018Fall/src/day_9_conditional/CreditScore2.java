package day_9_conditional;

import java.util.Scanner;

public class CreditScore2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("~~~~~ FICO CREDIT SCORE CHART ~~~~~");
		System.out.println("Please Enter Your Credit Score");
		int creditScore = scan.nextInt();

		String creditStatus = "Unknown";
		int percentage = 0;
		char p = '%';
		if (creditScore < 0 || creditScore > 850) {
			System.out.println("Invalid credit score, can not be negative or more than 850");
		} else if (creditScore == 0) {
			System.out.println("No Credit History");
		} else if (creditScore >= 1 && creditScore <= 299) {
			System.out.println("Very Bad Credit");
		} else if (creditScore >= 300 && creditScore <= 579) {
			creditStatus = "Very Poor";
			percentage = 16;
		} else if (creditScore >= 580 && creditScore <= 699) {
			creditStatus = "Fair";
			percentage = 18;
		} else if (creditScore >= 670 && creditScore <= 739) {
			creditStatus = "Good";
			percentage = 21;
		} else if (creditScore >= 740 && creditScore <= 799) {
			creditStatus = "Very Good";
			percentage = 25;
		} else if (creditScore >= 800 && creditScore <= 850) {
			creditStatus = "Exceptional";
			percentage = 20;
		} else {
			System.out.println("Invalid Credit Score ~ Call your bank");
		}

		System.out.println("Your Credit Status is: " + creditStatus + " " + "and you are in " + percentage + p + " "+ "of population.");
		scan.close();
	}
}
