package practicepublic;

import java.util.Scanner;

public class SwitchStatementPracticeInSchool2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = scan.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
			
		}
		scan.close();
	}

}
