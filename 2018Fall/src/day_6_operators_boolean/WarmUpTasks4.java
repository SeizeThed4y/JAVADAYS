package day_6_operators_boolean;

import java.util.Scanner;

public class WarmUpTasks4 {

	public static void main(String[] args) {

		// Create a program that accepts value
		// in miles and converts to kilometers

		Scanner scan = new Scanner(System.in);
		System.out.println("please type to the miles: ");
		double miles = scan.nextDouble();

		double km = miles * 1.609344;

		System.out.println(miles + " " + " Miles equle to " + " " + km + " " + "kilometers");

		scan.close();

	}

}
