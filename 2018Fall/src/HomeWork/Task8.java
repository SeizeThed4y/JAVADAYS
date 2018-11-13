package HomeWork;

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = scan.next();

		int cat = 0;
		int dog = 0;

		for (int i = 0; i < word.length() - 2; i++) {

			if (word.substring(i, i + 3).equals("cat")) {
				cat++;

			} else if (word.substring(i, i + 3).equals("dog")) {
				dog++;
			}

		}
		if (dog == cat) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}