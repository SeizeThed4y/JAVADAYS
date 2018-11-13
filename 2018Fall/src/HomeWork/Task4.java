package HomeWork;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		int num;

		do {
			System.out.println("enter a number");
			 num = scan.nextInt();
			boolean prime = true;
			if (num % 2 == 0) {
				if (num == 2) {
					System.out.println(prime);
				} else {
					System.out.println(!prime);
				}
			} else if (num % 3 == 0 || num % 5 == 0 || num % 7 == 0 || num % num == 0) {
				System.out.println(prime);
			}
		} while (num > 1);
		scan.close();
	}

}
