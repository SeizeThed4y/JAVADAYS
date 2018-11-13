package Day_16_Review_Section1;

import java.util.Scanner;

public class Operators {

	/*
	 * 
	 * 1. Arithmetic operators: + , - , / , * , %
	 * 
	 * 
	 * 
	 * 2. ShortHand Assignment: += , -= , /= , *= , %=
	 * 
	 * 
	 * 
	 * 3. increment / decrement: -- , ++
	 * 
	 * 
	 * 
	 * 4. Comprasion: > , >= , < , <= , == , !=
	 */

	public static void main(String[] args) {

		/*
		 * distance (mile) , pace ( miles per hour)
		 * 
		 * 
		 * how many minuted it will take to reach destination
		 * 
		 * 
		 */

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Distance");
//		double distance = scan.nextDouble();
//
//		System.out.println("Enter Your Speed");
//		double pace = scan.nextDouble();
//
//		double mins = distance / pace * 60;
//
//		System.out.println(mins);
//
//		// You spend 5 minutes in traffic
//		mins += 5.0;
//
//		// You spend 1 minute extra coz you took a wrong turn
//
//		mins++;
//
//		System.out.println("Finally it takes:" + mins + " minutes");

		int number = 10;

		System.out.println(number / 3); // 3
		System.out.println(number % 3); // 1

		System.out.println(number);
		++number; // add 1
		System.out.println(number);
		number++; // add 1
		System.out.println(number);

		int num2 = number++;  // after add 1  ---- ++number --> add one and then give variable 

		System.out.println(num2);
		System.out.println(number);//13
		//		14			14  = 28 + 5 == 33
		num2 = ++number + number++ + 5; // 15
		
		System.out.println(num2); // 27
		System.out.println(number); // 15

	}

}
