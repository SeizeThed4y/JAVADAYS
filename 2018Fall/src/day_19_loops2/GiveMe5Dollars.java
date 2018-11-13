package day_19_loops2;

import java.util.Scanner;

public class GiveMe5Dollars {
	
	public static void main(String[] args) {
		/*
		 * ask for 5 dollars
		 * and keep asking for 5 dollar 
		 * 
		 * until you get it 
		 * 
		 * or user enters it 
		 */
		
		
		
		Scanner scan = new Scanner (System.in);
		int amount;
		
		int tries = 1; // when we try to give 3 times 
		do {
			System.out.println("Give me $5 :) ");
			amount = scan.nextInt();
		}while(amount != 5);
			
		System.out.println("Thank you for $5");
		
	}

}
