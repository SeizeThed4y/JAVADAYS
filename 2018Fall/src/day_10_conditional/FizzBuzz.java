package day_10_conditional;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the number");
		int number = scan.nextInt();
		
		
		
		
		if (number % 5 == 0 && number % 3 == 0) {
			System.out.println("FizzBuzz");
		}else if (number % 3 == 0) {
			System.out.println("Fizz");
		}else if (number % 5 == 0 ) {
			System.out.println("Buzz");
		}else {
			System.out.println(number);
		}
			scan.close();
	}

}
