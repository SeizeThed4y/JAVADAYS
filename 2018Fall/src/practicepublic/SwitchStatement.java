package practicepublic;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("please enter the age between 1 - 3");
		int age = scan.nextInt();
		
		
		
		
		//int age = 3;

		switch (age) {
		case 1:
			System.out.println("You can crawl");
			break;
		case 2:
			System.out.println("You can talk");
			break;
		case 3:
			System.out.println("You can get in toruble");
			break;
		default: // it means similar to else
			System.out.println("I dont know how old are you");
			break;
		}
		
		scan.close();

	}

}
