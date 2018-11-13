package practicepublic;

import java.util.Scanner;

public class MethodGenerateAnEmail {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("enter your first name");
		String firstName = scan.next();

		System.out.println("enter your last name");
		String lastName = scan.next();

		System.out.println("Enter Email Domain");

		String emailDomain = scan.next();

		char at = '@';

		String email = buildEmail(firstName, lastName) + at + emailDomain;

		System.out.println(email.toLowerCase());

	}

	public static String buildEmail(String firstName, String lastName) {

		return firstName + lastName;

	}

}
