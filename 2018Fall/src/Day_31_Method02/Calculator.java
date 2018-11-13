package Day_31_Method02;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// first way
//		double a = scan.nextDouble();
//		double b = scan.nextDouble();
//		 
//
//			plus(a, b);
//			substract(a, b);
//			divide(a, b);
//			multiply(a, b);
//		
//			
//			// second way 
//		plus(a = scan.nextDouble(), b = scan.nextDouble());
//		substract(a = scan.nextDouble(), b = scan.nextDouble());
//		multiply(a = scan.nextDouble(), b = scan.nextDouble());
//		divide(a = scan.nextDouble(), b = scan.nextDouble());
//		
//		//////////////////
//		

//		plus(1, 2);
//		substract(5, 2);
//		multiply(3, 2);
//		divide(10, 2);

		System.out.println(
				"Choose operation: \n" + "1 - add \n" + "2 - substract \n" + "3 - multiply \n" + "4 - divide \n");

		
		System.out.println();
		
		System.out.println("Which operator you want to use ?");
		int operation = scan.nextInt();
		System.out.println("Enter First Number");
		double a = scan.nextDouble();
		System.out.println("Enter Second Number");
		double b = scan.nextDouble();
		switch (operation) {

		case 1:
			plus(a, b);
			break;

		case 2:
			substract(a, b);
			break;
			
		case 3:
			
			multiply(a, b);
			break;
			
		case 4:
			
			divide(a, b);
			break;
			
			
		}

	}

	public static void plus(double a, double b) {
		double result = a + b;
		System.out.println(result);



	}

	public static void substract(double a, double b) {
		double result = a - b;
		System.out.println(result);
	}

	public static void multiply(double a, double b) {
		double result = a * b;
		System.out.println(result);
	}

	public static void divide(double a, double b) {
		if (b == 0) {
			System.out.println("Error Cannot divide it to Zero");
		}else {
			double result = a / b;
			
			System.out.println(result);
		}
		
		
		
		
	}

}
