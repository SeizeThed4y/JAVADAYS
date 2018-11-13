package day_4_operators;

import java.util.Scanner;

public class Meeting {

	public static void main(String[] args) {
			// accept a string value using a scanner
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi Anna how is your mom");
		String momsCondition = scan.nextLine();
		
		System.out.println("Oh she is " + momsCondition);
		
	System.out.println("How about your family are they okay ?  ");
		String familyCondition = scan.nextLine();
		
		System.out.println("They are " + familyCondition );
		
	
		
		scan.close();

	}

}
