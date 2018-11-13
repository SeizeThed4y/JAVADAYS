package day_8_contionals2;

import java.util.Scanner;

public class Greades {

	public static void main(String[] args) {
		/*
		 * A, B, C ,D 
		 * if grade is a -> excellent
		 * grade is b - > god
		 * grade is C > acceptabl
		 * grade is D --> review all clases 
		 * 
		 */
		int score;
		char grade;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your Grade");
		score = scan.nextInt();
		
		
		if(score >= 90) {
			grade = 'A';
		}else if (score >= 80) {
			grade = 'B';
		}else if (score >= 70) {
			grade = 'C';
		}else if (score >=60) {
			grade = 'D';
		}else {
			grade = 'F';
			System.out.println("You have failed the course");
		}
			System.out.println("Your grade is : " + grade);
		
		scan.close();
		
		
	}

}
