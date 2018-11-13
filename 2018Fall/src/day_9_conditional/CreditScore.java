package day_9_conditional;

import java.util.Scanner;

public class CreditScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Your Credit Score ");
		int creditScore = scan.nextInt();
		
		if(creditScore >= 300 && creditScore <=579) {
			System.out.println("Your credit score is Very Poor");
		}else if(creditScore >=580 && creditScore <= 699) {
			System.out.println("Your credit score is Fair");
		}else if(creditScore >= 670 && creditScore <= 739) {
			System.out.println("Your credit score is Good");
		}else if(creditScore >= 740 && creditScore <= 799) {
			System.out.println("Your credit score is Very Good");
		}else if(creditScore >= 800 && creditScore <= 850) {
			System.out.println("Your credit score is Exceptional");
		}else if (creditScore > 850 ){
			System.out.println("Your Credit score is flying");
		}else {
			System.out.println("You better to watch out your credit score");
		}

			scan.close();
	}

}
