package day_9_conditional;

import java.util.Scanner;

public class WarmUpTask1 {
	public static void main(String[] args) {
		/*
		 * You have 2 variables num1 and num2 assign value of larger one into variable
		 * max
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the x number");
		int x = scan.nextInt();
		System.out.println("please enter the y number");
		int y = scan.nextInt();

		if (x > y) {
			System.out.println("X is the bigger number");
		} else {
			System.out.println("Y is the bigger number");
		}

		scan.close();

	}

}
