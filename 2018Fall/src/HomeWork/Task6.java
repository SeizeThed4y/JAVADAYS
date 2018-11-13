package HomeWork;

import java.util.Scanner;



public class Task6 {

	public static void main(String[] args) {

		task();

	}

	public static void task() {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Enter the number");
			int number = scan.nextInt();

			if (number > 12 || number <= 0) {
				System.out.println("You entered an incorrect number");
				break;

			}
		}

	}

}
