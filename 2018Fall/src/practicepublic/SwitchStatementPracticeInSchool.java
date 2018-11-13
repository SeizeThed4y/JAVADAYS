package practicepublic;

import java.util.Scanner;

public class SwitchStatementPracticeInSchool {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter number of the restrant 1 - 3");
		int resturantRating = scan.nextInt();
		
		
		//int restraurantRating = 3;

		switch (resturantRating) {
		case 1:
			System.out.println("This resturant is not my favorite");
			break;
		case 2:
			System.out.println("This resturant is good");
			break;
		case 3:
			System.out.println("This resturant is my fantastic");
			break;
		default:
			System.out.println("I`ve never dined at this resturant");
			break;
		}
		
		scan.close();

	}

}
