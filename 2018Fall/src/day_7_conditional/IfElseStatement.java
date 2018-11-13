package day_7_conditional;

public class IfElseStatement {
	public static void main(String[] args) {

		double coffePrice = 6.50;

		if (coffePrice < 6.0) {
			System.out.println("I will get coffee");
		} else {
			System.out.println("I cannot get coffee. Too Expensive");
		}
		
		double accountBalance = 450.50;
		double price = 700;
		
		//if you have enough money, you buy the item
		// if you dont have enough money . you dont buy the item
		
		if(accountBalance >= price) {
			System.out.println("You can buy the Item");
			System.out.println("I am ordering online");
		}else {
			System.out.println("You Dont buy the item. Too Expensive");
			System.out.println("Lets wait for paycheck");
		}
		
		/*
		 * create 2 variables ; speedLimit, currentSpeed
		 * if currentSpeed is more than 20mpg compared to speed limit
		 * then you are getting a speeding ticket
		 * otherwise keep driving
		 */
		
		int speedLimit, currentSpeed;
		speedLimit = 55;
		currentSpeed = 75;
		
		if(currentSpeed > speedLimit + 20) {
			System.out.println("Hey!! Slow Down");
			System.out.println("You are going to get a ticket");
		}else {
			System.out.println("Good job");
			System.out.println("Keep Driving");
		}
		System.out.println("====================");
		
		/*
		 * create a boolean variable isPrime
		 * if isPrime is true then shipping is O.O
		 * if not then shipping is 7.99
		 * print shipping cost 
		 */
		
		
		
	}

}
