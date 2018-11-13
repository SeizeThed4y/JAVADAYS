package Day_20;

import java.util.Scanner;

public class WarmUpTask1and2IfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number");
		int start = scan.nextInt();
		int end = scan.nextInt();

		if (start < end) {
			System.out.println("Looping Forward");
			while (start <= end) {
				System.out.println("Step " + start);
				start++;
			}
		} else if (start > end) {
			System.out.println("Looping backward");
			while (start >= end) {
				System.out.println("Step " + start);
				start--;
			}
		}
		scan.close();
	}

}
