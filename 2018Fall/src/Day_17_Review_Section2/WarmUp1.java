package Day_17_Review_Section2;

import java.util.Scanner;

public class WarmUp1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Age");
		double months = scan.nextDouble();

		if (months < 0.0) {
			System.out.println("Not Born yet");
			return; // get out from main method and dont run below codes.
		}

		// based on months , find out year
		// divide months by 12 and get whole years
		int year = (int) (months * 12);

		// find out number of remaining ,months
		int remainingMonths = (int) (months % 12);

		String ageGroup = "";

		if (months < 1.0) {
			ageGroup = "Neonate";
			System.out.println("Weeks old: " + (months / 0.25));
		} else if (year < 1) {
			ageGroup = "Infant";
			System.out.println("Months: " + months);
		} else if (year < 13) {
			if (year < 3) {
				ageGroup = "Toddler";

			} else if (year < 6) {
				ageGroup = "Pre - School child";

			} else {
				ageGroup = "School Age Child";
			}

		} else if (year < 65) {
			if (year < 19) {
				ageGroup = "Adolescent";

			} else if (year < 41) {
				ageGroup = "Young Adult";
			} else {
				ageGroup = "Middle age Adult";
			}
		} else {
			System.out.println("Older Adult");
		}
		System.out.println("Age Group is: " + ageGroup);
		System.out.println("Years: " + year);
	}

}
