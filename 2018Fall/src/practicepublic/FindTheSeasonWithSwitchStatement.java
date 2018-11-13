package practicepublic;

import java.util.Scanner;

public class FindTheSeasonWithSwitchStatement {

	public static void main(String[] args) {
		/*
		 * 1. find a season
		 * month -> number and find the season of the year that month number.
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of the month");
		int month = scan.nextInt();
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("The season is Winter");
		break;
		
		case 3:
		case 4:
		case 5:
			System.out.println("The season is Spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("The season is Summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("The season is Fall");
			break;
			default:
				System.out.println("The months has to be in between 1 - 12 ");
		}
		
		scan.close();
		
	}

}
