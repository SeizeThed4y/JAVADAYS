package day_21;

import java.util.Scanner;



public class warmuptask2 {

	public static void main(String[] args) {

		/*
		 * Task 2 Accept a String and a character find out how many times that character
		 * appears in the string.
		 * 
		 * ex
		 * 
		 * enter word:
		 * 
		 * java
		 * 
		 * enter character:
		 * 
		 * a
		 * 
		 * 2
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = scan.next().toLowerCase();
		System.out.println("Enter the char");
		char singleChar = scan.next().charAt(0);

		int counter = 0;

		for (int i = 0; i < word.length(); i++) {

			// System.out.println(word.charAt(counter));

			if (word.charAt(i) == singleChar) {
				counter++;
			}

		}

		System.out.println(counter);
		scan.close();

	}

}
