package day_10_conditional;

import java.util.Scanner;

public class WarmUpFindTheSeasonWithMonth {
	/*
	 * 1. find a season
	 * 	month -> number and find the  season of the year that month number.
	 */
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the number of the month: ");
		int month = scan.nextInt();
		
		String season= " ";
		
		if(month == 12 || month == 1 || month == 2) {
			season = "Winter";
		}else if (month == 3 || month == 4 || month == 5) {
			season = "Spring";
		}else if (month == 6 || month == 7 || month == 8) {
			season = "Summer";
		}else if (month == 9 ||	month == 10 || month == 11) {
			season = "Fall";
			
		}else {
			System.out.println("Wrong number, you can choose between 1 - 12");
		}
		System.out.println(month+ " the number of the month is:"+ " " + season);

		scan.close();
	}

}
