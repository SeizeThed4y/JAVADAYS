package day_8_contionals2;

import java.util.Scanner;

public class PracticeTaskElseIFinClass {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the day as a number");
		int weekday = scan.nextInt();
		
		
		//int weekday =1 ;
		
		
		
		
		if(weekday == 1){
			System.out.println("It is monday");
			
		}else if (weekday == 2) {
			System.out.println("It is Tuesday");
		}else if (weekday == 3) {
			System.out.println("It is Wednesday");
		}else if (weekday == 4) {
			System.out.println("It is Thursday");
		}else if (weekday == 5) {
			System.out.println("It is Firday");
		}else if (weekday == 6) {
			System.out.println("It is Saturday");
		}else if (weekday == 7) {
			System.out.println("It is Sunday");
		}else {
			System.out.println("Invalid day. Can be Only 1-7");
		}
		scan.close();
	}

}
