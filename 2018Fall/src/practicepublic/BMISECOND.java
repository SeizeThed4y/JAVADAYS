package practicepublic;

import java.util.Scanner;

public class BMISECOND {

	public static void main(String[] args) {
		System.out.println("Welcome to BMI calculator");
		System.out.println("BMI Categories: \n" + "Underweight < 18.5 \n" + "Normal weight = 18.5–24.9 \n"
				+ "Overweight = 25–29.9 \n" + "Obesity = BMI of 30 or greater \n");
		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter Your height");
		double height = scan.nextDouble();

		System.out.println("Please Enter Your Kg");
		double kg = scan.nextDouble();

		double bmi;

		bmi = kg / (height * height);

		System.out.println("Your BMI is: " + bmi);

		if (bmi <= 18.5) {
			System.out.println("You are under weight");
		} else if (bmi >= 18.6 && bmi <= 24.9) {
			System.out.println("You are Normal Weight");
		} else if (bmi >= 25 && bmi <= 29.9) {
			System.out.println("You are over wight");
		} else {
			System.out.println("You are an obese");
		}
		scan.close();
	}
}
