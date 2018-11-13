package practicepublic;

import java.util.Scanner;

public class CoinCalPracticeRamainder {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please Enter How Many Coins You Have");
		int pennies = scan.nextInt();
		int dollars, quarters, dimes , nickels, cents;
		
		dollars = pennies / 100;
		pennies %= 100;
		
		quarters = pennies / 25;
		pennies %= 25;
		
		dimes = pennies / 10;
		pennies %= 10;
		
		nickels = pennies / 5;
		pennies %= 5;
		
		cents = pennies;
		
		System.out.println("Dollars: " + dollars);
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Cents: " + cents);
		scan.close();
		
		
	}

}
