package practicepublic;

import java.util.Scanner;

public class VendingMachineChange {

	
	//UEN_Fairfax_Group 3 -- Survivors 
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter increments price  between 25 - 100");
		int priceDrink = scan.nextInt();

		int change, quarters, dimes, nickels;

		change = 100 - priceDrink;

		quarters = change / 25;
		change %= 25;

		dimes = change / 10;
		change %= 10;

		nickels = change / 5;
		change %= 5;

		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);

		scan.close();

	}

}
