package GroupProject10_1;

import java.util.Scanner;

public class Part2Task2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int countpositive = 0, countnegative = 0, countzeros = 0;
		int num;
		String choice = "y";

		while (choice.equals("yes") || choice.equals("y")) {
			System.out.println("enter your number");
			num = scan.nextInt();

			if (num > 0)
				++countpositive;
			if (num < 0)
				++countnegative;
			if (num == 0)
				++countzeros;

			System.out.println("would you like to continue? Yes (y) / for No anyword");
			choice = scan.next().toLowerCase();

		}

		System.out.println("Number of postive intergers entered: " + countpositive);
		System.out.println("Number of negative integers entered: " + countnegative);
		System.out.println("Number of zero integers entered: " + countzeros);

	}

}
