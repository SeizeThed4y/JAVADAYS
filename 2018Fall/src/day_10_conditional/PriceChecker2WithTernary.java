package day_10_conditional;

import java.util.Scanner;

public class PriceChecker2WithTernary {

	public static void main(String[] args) {
		/*
		 * item ->
		 *  1 - 50 -> "Cheap"
		 * 51 - 100 -> "Expensive"
		 * 
		 * "Not buying
		 * 
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please Enter price of the product");
		int price = scan.nextInt();
		
		String status;
		
		status = (price >= 1 && price <= 50)?("Cheap"):(price >= 51 && price <= 100)?("Expensive"):(price < 1)?("Its free"):("Not Buying So expensive");
		System.out.println(status);
		scan.close();
	}

}
