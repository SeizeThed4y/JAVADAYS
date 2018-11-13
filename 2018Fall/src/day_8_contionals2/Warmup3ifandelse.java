package day_8_contionals2;

import java.util.Scanner;

public class Warmup3ifandelse {

	public static void main(String[] args) {

		/*
		 * ask user to enter a number. and check if it is odd or even if even print "It
		 * is even number, else print it is odd umber
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the number: ");
		int number = scan.nextInt();

		if (number % 2 == 0) {
			System.out.println("its an even number");
		} else {
			System.out.println("its an odd number");
		}

		scan.close();
	}

}
