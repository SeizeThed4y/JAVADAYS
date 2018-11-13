package practicepublic;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Any String");

		String name = scan.next();
		System.out.println("========================================");
		for (int i = 0; i < name.length(); i++)
			System.out.println(name.substring(0, i + 1));
		
		scan.close();
	}
}