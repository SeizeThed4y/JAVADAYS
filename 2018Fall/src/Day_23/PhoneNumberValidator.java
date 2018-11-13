package Day_23;

import java.util.Scanner;

public class PhoneNumberValidator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter phone number:");

		String phoneNumber = input.next();

		// - if length is not 12 or 10 characters,
		// then -> show error message :
		// invalid length - must be either 12 or 10 characters. -> 10
		// (222)22222

		if (phoneNumber.startsWith("(")) {
			if (phoneNumber.length() != 12) {
				System.out.println("invalid length - must be either 12 or 10 characters");
				return;

			}
		} else {
			if (phoneNumber.startsWith("(")) {
				System.out.println("invalid length - must be either 12 or 10 characters");
				return;
			}
		}

		System.out.println("Phone number length is good");

		// - If first character is '(' then 1. fifth character must be ')'
		// -> if not show error message: Invalid format -there is no closing
		// parenthesis.

		if (phoneNumber.charAt(0) == '(') {
			if (phoneNumber.charAt(4) != ')') {
				System.out.println("Invalid format ~ There is no closing parenthesis");
				return;
			}

		}
		System.out.println("Paranthesis format check passed");

		phoneNumber = phoneNumber.replace("(", ""); // if there is '(' then remove it

		phoneNumber = phoneNumber.replace(")", ""); // if there is ')' then remove it

		phoneNumber = phoneNumber.replace("-", "");

		// - Using a loop check if each character is a number between 0-9. -> if not
		// show error message: Invalid character - must be a number between 0-9.

		for (int i = 0; i < phoneNumber.length(); i++) {
			if (!(phoneNumber.charAt(i) >= '0' && phoneNumber.charAt(i) <= '9')) {
				System.out.println("Invalid character - must be a number between 0-9." + phoneNumber.charAt(i));
				return;
			}
		}
		System.out.println("All numbers detected.");
	}

}
