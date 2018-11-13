package practicepublic;

import java.util.Scanner;

// uen_fairfax_group_3 -- Group Name : Survivors 

public class SaleWithDiscountCalculatorUENGROUP3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Unit Price");
		double unitPrice = scan.nextDouble();

		System.out.println("Enter Quantity");
		double quantity = scan.nextInt();

		double grandtotal = 0;

		System.out.println("Grand Total is: $" + grandtotal);
		double discount = 0;

		if (quantity >= 100 && quantity <= 120) {
			System.out.println("Grand Total is: $" + (grandtotal = unitPrice * quantity));
			discount = grandtotal * 0.1;
			System.out.println("discount %10");
		} else if (quantity > 120) {
			System.out.println("Grand Total is: $" + (grandtotal = unitPrice * quantity));
			discount = grandtotal * 0.15;
			System.out.println("Discosunt %15");
		} else if (quantity < 100 && quantity >=0) {
			System.out.println("Grand Total is: $" + (grandtotal = unitPrice * quantity));
			discount = 0;
			System.out.println("Discount %0");

		} else {
			System.out.println("Invalid");
		}

		System.out.println("Discount applied: $" + discount);
		System.out.println("Total: $" + (grandtotal - discount));

		scan.close();
	}

}
