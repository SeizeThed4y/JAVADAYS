package day_10_conditional;

import java.util.Scanner;

public class BooleanIFElseWithTernary {

	public static void main(String[] args) {

		/*
		 * boolean variable express
		 * 
		 * if true -> shipping = $25
		 * 
		 * if false -> shipping = $15
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter True for Express , False For Regular");
		boolean express = scan.nextBoolean();
		// boolean express = false;
		String shippinType;

		shippinType = (express) ? ("Shipping is $25") : ("Shipping is $15");

		System.out.println(shippinType);
		
		scan.close();
	}
	

}
