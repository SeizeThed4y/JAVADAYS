package day_13;

import java.util.Scanner;

public class Practice1Compare {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First word");
		String w1 = scan.next();
		System.out.println("enter second word");
		String w2 = scan.next();
		System.out.println("Enter third word");
		String w3 = scan.next();

		int count1 = w1.length(); // --> int a = 1;
		int count2 = w2.length();
		int count3 = w3.length();

		if (count1 == count2 && count1 == count3 && count2 == count3) {
			System.out.println("All words are same length");

		} else if (count1 == count2 || count2 == count3 || count1 == count2 || count1 != count2 || count1 != count3
				|| count2 != count3) {
			System.out.println("Not same or different lengths");
		} else {
			System.out.println("All are different length");
		}

		scan.close();

	}
}
