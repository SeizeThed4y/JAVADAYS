package day_15;

import java.util.Scanner;

public class WarmUpPractice1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Word");
		String word1 = scan.next();
		System.out.println("Enter Second Word");
		String word2 = scan.next();
		System.out.println("=====================================");
		System.out.println(word1 + word2 + word2 + word1);

		System.out.println("=====================================");

		// System.out.println(word1.charAt(word1.length() - 1));
		// System.out.println(word1.charAt(0));

//		if (word1.charAt(word1.length() - 1) == word2.charAt(0)) {
//			System.out.println(word1.concat(word2.substring(1)));
//		} else {
//			System.out.println(word1.concat(word2));
//		}

		if (word1 == word2) {
			System.out.println(word1 + word2.substring(1));
		} else {
			System.out.println(word1 + word2);
		}
		scan.close();

	}

}
