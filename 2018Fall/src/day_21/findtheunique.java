package day_21;

import java.util.Scanner;

public class findtheunique {
	public static void main(String[] args) {
		/*
		 * Task 3
		 * 
		 * Accept a String and print only unique characters in the String:
		 * 
		 * input:
		 * 
		 * java
		 * 
		 * output: jav
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = scan.next();

		String unique = "";
//		int i = word.length()-1;
//		System.out.println(word.substring(i, i+1));
//		

		for (int i = 0; i < word.length(); i++) {
			// System.out.println(word.subSequence(i, i+1));

			if (!unique.contains(word.substring(i, i + 1))) {
				unique += word.substring(i, i + 1);
			}

		}

		System.out.println(unique);

		
	
		
		scan.close();
	}
}
