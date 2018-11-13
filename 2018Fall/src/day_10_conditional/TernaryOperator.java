package day_10_conditional;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		
		/*
		 * max score 100. passing score 60
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the number: ");
		int score = scan.nextInt();
		
		String passing;
		
		passing = (score >= 60)?("You have passed "):("you failed");
		System.out.println(passing);
		
		scan.close();
	}

}
