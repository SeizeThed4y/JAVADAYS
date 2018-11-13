package day_11_conditional;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Your Grade: ");
		char grade = scan.next().charAt(0);
		// char grade = 'A';

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("Exellent");
			break;
		case 'B':
		case 'b':
			System.out.println("Good");
			break;
		case 'C':
		case 'c':
			System.out.println("Acceptable");
			break;
		case 'D':
		case 'd':
			System.out.println("Poor");
			break;
		default:
			System.out.println("ERROR: invalid grade");

		}
		scan.close();

	}

}
