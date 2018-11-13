package practicepublic;

import java.util.Scanner;

public class BodyIndex {

	public static void main(String[] args) {
		

		
		Scanner keyboard = new Scanner(System.in);
		
		double height, heightFeet, heightInches, weight, BMI;
		
		System.out.print("Your height (feet only): ");
		heightFeet = keyboard.nextDouble();
		
		System.out.print("Your height (inches): ");
		heightInches = keyboard.nextDouble();
		
		System.out.print("Your weight in pounds: ");
		weight = keyboard.nextDouble();
		
		height = heightFeet * 12 + heightInches;
		BMI = weight * (703 / (height * height));
		System.out.println();
		System.out.println("Your BMI is " + BMI);
		
		if(BMI <= 18.5) {
			System.out.println("You are Underweight");
		}else if (BMI > 18.5 && BMI <= 24.9) {
			System.out.println("You are Normal Weight");
		}else if (BMI >= 25 && BMI <= 29.9) {
			System.out.println("You are Overweight");
		}else {
			System.out.println("You are obesity");
		}
		keyboard.close();
	}

}
