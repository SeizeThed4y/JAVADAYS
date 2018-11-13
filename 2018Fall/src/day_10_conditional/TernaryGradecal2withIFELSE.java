package day_10_conditional;

import java.util.Scanner;

public class TernaryGradecal2withIFELSE {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Your Score: ");
		int score = scan.nextInt();
		
		if(score >= 60) {
			System.out.println("You passed");
		}else {
			System.out.println("You failed");
		}
		scan.close();
	}
}
