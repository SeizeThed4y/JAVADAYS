package practicepublic;

import java.util.Scanner;

public class PracticeOne {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age; ");
		int age1=scan.nextInt();
		
		int years = age1*(1);
		int months = age1*(12);
		int  weeks = age1*(52);
		int days = age1 * (365);
		int hours = age1*(8765);
		int minutes = age1*(525600);
		int seconds = age1*(31536000);
		
		
		
		System.out.println(" years: " +years);
		System.out.println("months: " + months);
		System.out.println("Days: " + days);
		System.out.println("hours: " + hours);
		System.out.println("minutes: " + minutes);
		System.out.println("seconds " + seconds);
		System.out.println("Weeks: " + weeks);
		
		scan.close();
		
	}

}
