package day_11_conditional;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter The Floor");
		int floor = scan.nextInt();

		switch (floor) {
		case 1:
			System.out.println("It is lobby");
			break;
		case 2:
			System.out.println("Google");
			break;
		case 3:
			System.out.println("Cybetek");
			break;
		case 4:
			System.out.println("Apple");
			break;
		default:
			System.out.println("There is only 4 floors");
		}
		scan.close();
	}

}
