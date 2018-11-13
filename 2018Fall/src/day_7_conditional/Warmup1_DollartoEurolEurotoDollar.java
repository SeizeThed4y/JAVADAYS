package day_7_conditional;

import java.util.Scanner;

public class Warmup1_DollartoEurolEurotoDollar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Dollar Amount:  ");
		double dollars = scan.nextDouble();
		System.out.println("Please Enter Euro Amount: ");
		double euros = scan.nextDouble();

		System.out.println(dollars + " Dollars Equal to " + (dollars * 0.86) + " " + " Euros.");
		System.out.println(euros + " Euros Equal to " + (euros * 1.16) + " " + "Dollars. ");
		scan.close();

	}

}
