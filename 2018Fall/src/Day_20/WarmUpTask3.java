package Day_20;

import java.util.Scanner;

public class WarmUpTask3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = scan.next();

		int counter = 0;
		while (counter < word.length()) {
			System.out.println(word.charAt(counter));
			counter++;
		}

		scan.close();
	}

}
