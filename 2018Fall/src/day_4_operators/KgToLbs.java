package day_4_operators;

import java.util.Scanner;

public class KgToLbs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter Kg: ");
		
		int kilogram = scan.nextInt();
		
		double lbs = kilogram * 2.2;
		
		System.out.println(kilogram + " kilogram is equal to " + lbs + " lbs.");
		
		scan.close();

	}

}
