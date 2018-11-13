package day_5_operators;

import java.util.Scanner;

public class CoinCal {

	public static void main(String[] args) {
//		  int pennies = 250;
//		  int dollar = pennies / 100;
//		  
//		  System.out.println( dollar + " dollars you have");
//		  
//		  pennies %= 100;
//		  System.out.println("Remainning Pennies: " + pennies);
//		  
//		  
		
		
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter count of pennies you have");
			int pennies = keyboard.nextInt();//333
			int dollars, quaters, dimes, nickels, penniesLeft;
		
		
			
			dollars	= pennies / 100;
			pennies %= 100;//33
			
			
			
			quaters = pennies / 25;// 33 / 25 --> 1
			pennies %= 25;// 3 / 25 --> 8
			
			dimes = pennies / 10; // 8 / 10 -> 0
			pennies %= 10;// 8 % 10 --> 8
			
			nickels = pennies / 5; // 8 / 8 / --> 1
			pennies %= 5; // 8 % 5 --> 3
			
			penniesLeft = pennies;
			
			
			
			
			System.out.println("Dollars: " + dollars);
			System.out.println("Quaters: " + quaters);
			System.out.println("Dimes: " + dimes);
			System.out.println("Nickles: " + nickels);
			System.out.println("Pennies Left: " + penniesLeft);
			
			
			keyboard.close();

	}

}
