package day_13;

import java.util.Scanner;

public class Practice1LastLetterOfFirstNameAndFirstLetterOfLastName {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First NAME: ");
		String firstName = scan.next();

		System.out.println("Enter Last Name: ");
		String lastName = scan.next();

		if (firstName.length() != 5 || lastName.length() != 5) {
			System.out.println("need to be exactly 5 character");
		} else if (firstName.charAt(4) == lastName.charAt(0)) {
			System.out.println("Fizz");
		} else {
			System.out.println("Buzz");
		}

		scan.close();

	}

}
