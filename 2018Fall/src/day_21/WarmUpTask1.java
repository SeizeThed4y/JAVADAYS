package day_21;

import java.util.Scanner;

public class WarmUpTask1 {

	public static void main(String[] args) {
		/*
		 * 
		 * Task 1 accept a string and if it is palindrome, print"Palindrome", if no
		 * print "Plaindrome"
		 * 
		 * ex enter word
		 * 
		 * java not palindrome
		 * 
		 * civic palindrome
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scan.next();

		String reversed = "";

		for (int idx = word.length() - 1; idx >= 0; idx--) {

			reversed += word.charAt(idx);

		}

		if (word.equalsIgnoreCase(reversed)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Non Palindrome");
		}

		scan.close();

	}

}
