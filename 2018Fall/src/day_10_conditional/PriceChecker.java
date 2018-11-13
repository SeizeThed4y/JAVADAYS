package day_10_conditional;

import java.util.Scanner;

public class PriceChecker {

	public static void main(String[] args) {
		
		/*
		 * item ->
		 *  1 - 50 -> "Cheap"
		 * 51 - 100 -> "Expensive"
		 * 
		 * "Not buying
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter The Price: ");
		int price = scan.nextInt();
		String status;
		
		if(price >= 1 && price <= 50 ) {
			status = ("Cheap");
		}else if ( price >= 51 && price <= 100) {
			status = ("Expensive");
		}else if (price < 1) {
			status = ("It is free");
		}else {
			status = ("Too expensive not buy it");
		}
		
		
		System.out.println(status);
		scan.close();
		
	}

}
