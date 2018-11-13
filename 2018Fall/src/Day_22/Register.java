
package Day_22;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {

		String item = "";
		String result2 = "";
		double itemPrice = 0;
		double totalPrice = 0;
		int i = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("How many items are you purchasing?");
		int number = scan.nextInt();
		
		

		for (i = 1; i <= number; i++) {

			System.out.println("What is item " + i + "?");
			item = scan.next();
			System.out.println("How much is the  " + item);

			itemPrice = scan.nextDouble();

			totalPrice += itemPrice;

			result2 += item + ", ";
			
			

		}
		System.out.println("Your Items: " + result2.substring(0,result2.length()-2));  // delete (,) after last word.
		//System.out.println("Your Total price: " + totalPrice);  // 23.449999999999
		//System.out.printf("Your total price: $%.2f",totalPrice);  // 23.44
		System.out.println("Your Total Price: " + ((int)(totalPrice * 100) ) /100.0); // 23.44m
		
		
	}
}