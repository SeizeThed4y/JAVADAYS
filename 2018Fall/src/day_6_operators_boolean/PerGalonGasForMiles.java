package day_6_operators_boolean;

import java.util.Scanner;

public class PerGalonGasForMiles {

	public static void main(String[] args) {
		// write a program that ask user to enter current car odometer miles
		// and previous car odometer miles. also number of gallons that was put.
		// price per gallon.

		// calculate mpg --> miles per galling value.
		// calculate total fuel expense.

		Scanner scan = new Scanner(System.in);

		double currentodometer, previousodometer, gallonsgas, pricepergallong;

		System.out.println("Entter Current car`s odometer: ");
		currentodometer = scan.nextDouble();

		System.out.println("Enter previous odometer");
		previousodometer = scan.nextDouble();

		System.out.println("Enter Gallong Gas Put");
		gallonsgas = scan.nextDouble();

		System.out.println("Enter Price Per Gallon");
		pricepergallong = scan.nextDouble();

		System.out.println("miles per gallong" + " " + (currentodometer - previousodometer) / gallonsgas);

		System.out.println("Total fuel expense:" + " " + (gallonsgas * pricepergallong));

		scan.close();

	}

}
