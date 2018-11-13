package day_12_java;

import java.util.Scanner;

public class GetBeverage {

	public static void main(String[] args) {
		/*
		 * tea --> $3
		 * 
		 * coffee --> $4
		 * 
		 * water -- > $2
		 * 
		 * juice -- > $5
		 *
		 *
		 * Strink drink;
		 *
		 * double price;
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter The Drink Name");
		String drink = scan.next();

		double price = 0.0;

		switch (drink) {
		case "Tea":
		case "TEa":
		case "TEA":
		case "tEa":
		case "tEA":
		case "teA":
		case "TeA":
			price = 3.00;

			break;
		case "coffee":
			price = 4.00;

			break;
		case "water":
			price = 2.00;
			break;
		case "juice":
			price = 5.00;
			break;
		default:
			System.out.println("we have only 4 options");
			break;

		}
		System.out.println("Your total price is: $" + price);
		scan.close();

	}

}
