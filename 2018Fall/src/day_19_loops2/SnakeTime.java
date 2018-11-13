package day_19_loops2;

import java.util.Scanner;

public class SnakeTime {

	public static void main(String[] args) throws InterruptedException {
		
		//create a boolean variable hungry and assign true
		// create int variable apples.
		
		
		/*
		 * as long as you are hungry print "eating an apple"
		 * 
		 * amd increase the apple
		 * 
		 * once you eat 5 apples, you are no longer hungry.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many apples do you wanna it");
		int amountApplesEat = scan.nextInt();
		
		int apples = 1;
		
		boolean hungry = true;

		
		
		while(hungry) {
			
				System.out.println("Eating an apple");
				
				Thread.sleep(100);
		if(apples == amountApplesEat) {
				hungry = false;
			System.out.println("No longer hungry");
				
			}
		apples++;
				
			
		}
	}

}
