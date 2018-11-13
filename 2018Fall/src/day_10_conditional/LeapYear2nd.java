package day_10_conditional;

import java.util.Scanner;

public class LeapYear2nd {
	public static void main(String[] args) {
		
		/* !!!!!!!!!!!! INTERVIEW QUESTION !!!!!!!!!!!!!!!!!!
		 * 
		 * 
		 * 2. leap year(Februrary 29 days)
		 * if an year is 1 divisble 400 or divisible of 4 but not divisible of  1-- then its a leap year	
		 * 
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Year : ");
		int year = scan.nextInt();
		
		
		
		
		
		
		if( year % 400 == 0) {
			System.out.println("it is a leap year ");
		}else if (year % 4 == 0 && year % 100 == 0) {
			System.out.println("It is a leap year");
		
		} else { 
			System.out.println("Not a leap year");
		}
		scan.close();
			
		}
	}
