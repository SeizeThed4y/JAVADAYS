package Day_20;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Random is a class
		// the purpose of this class is to generate random numbers

		Random random = new Random();

		// give me random number 0 - 9

		int secretNumber = random.nextInt(100);

		int guessedNumber;
		do {

			System.out.println("Guess The Number");
			guessedNumber = scan.nextInt();

			if (guessedNumber == secretNumber) {
				System.out.println("Congratulations !! You Won !");
			} else if (guessedNumber > secretNumber) {
				System.out.println("Too large");
			} else {
				System.out.println("Too small");
			}

		} while (secretNumber != guessedNumber);

	}

}
