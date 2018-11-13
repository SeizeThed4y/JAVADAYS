package day_5_operators;

import java.util.Scanner;

public class SomeOfNumbers {
	public static void main(String[] args) {
		/*Warm up task = 1
		 * Write a program that ask user to enter 3 number from keyboard and calculates
		 * the sum of those numbers then show result
		 * 
		 */

		Scanner keyboard = new Scanner(System.in);
		
		
		// First way to do it 
//
//		System.out.println("Please enter the first number ");
//
//		int first = keyboard.nextInt();
//
//		System.out.println("Please Enter the second number");
//
//		int second = keyboard.nextInt();
//
//		System.out.println("Pleae Enter the third number");
//
//		int third = keyboard.nextInt();
		
//		System.out.println(first * second + third);
		
		
		
		// Second way to do it 
		
		System.out.println("Please enter 3 numbers");
		int first = keyboard.nextInt();
		int second = keyboard.nextInt();
		int third = keyboard.nextInt();
		System.out.println(first * second + third);

		keyboard.close();

	}

}
