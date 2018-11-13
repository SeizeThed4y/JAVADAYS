package day_5_operators;

public class OperatersPractice {

	public static void main(String[] args) {
		
			// declare variable apples and assign 5
			// add 10 more apples using shorthand operator
		
			//declare variable carsInLot and assign 23
			//decrease carInLot by 10 using shorthand operator
		
			// declare variable pizzaSlices and assign 12 to it
			// divide pizzaSlices amount 5 people and assign the amount
			// each person gets back to pizzaSlices
		
			//declare variable minutes and assign 100 to it
			//find out how many remaining minutes that do not make another hour
			//and assign back to minutes do not make another hour
			//and assign back to minutes also add another variable hours
			//and assign whole hours count to it
		
			// 1st task
		
			int apples = 5;
			apples += 10;
			System.out.println(apples);
			
			//2nd task
			
			int carsInLot = 23;
			carsInLot -= 10;
			System.out.println(carsInLot);
			
			//3rd task
			
			double pizzaSlices = 12;
			pizzaSlices /= 5;
			
			System.out.println(pizzaSlices);
			
			//4th task
			
			int minutes = 1;
				// find out how many whole hours
			int hours = minutes / 60;
			System.out.println("Hours: " + hours);
			minutes %= 60; //  100 / 60 --> remainder = 40
			
			System.out.println("Remainning Minutes: " + minutes);
			
			
					
		
		
		
	}

}
