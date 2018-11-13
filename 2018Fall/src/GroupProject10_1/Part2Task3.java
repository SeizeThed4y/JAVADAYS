package GroupProject10_1;

import java.util.Scanner;

public class Part2Task3 {

	public static void main(String[] args) {

		char answer = 'y';
		int largest = 0;
		int smallest = 0;

		@SuppressWarnings("resource")

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Enter number");
			int number = scan.nextInt();
			System.out.println("Would you like to continue y/n?");
			answer = scan.next().charAt(0);
			if (largest == 0 && number > 0) {
				smallest = number;
			}
			if (number < smallest) {
				smallest = number;
			}
			if (number > largest) {
				largest = number;
			}

		} while (answer == 'y');
		System.out.println("Largest number: " + largest);
		System.out.println("Smallest number: " + smallest);
	}

}
