package practicepublic;

import java.util.Scanner;

public class LeapYearWithCase {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the month");
		int month = scan.nextInt();
		System.out.println("Please Enter the year");
		int year = scan.nextInt();

		int numDays = 0;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDays = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
			break;
		case 2:
			if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
				numDays = 29;
			else
				numDays = 28;

			break;
		default:
			System.out.println("Invalid month.");
			break;
		}
		System.out.println("Number of Days = " + numDays);

		scan.close();

		System.out.println();

	}

}
