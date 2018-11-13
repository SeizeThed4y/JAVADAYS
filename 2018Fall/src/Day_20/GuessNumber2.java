package Day_20;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber2 {

	public static void main(String[] args) {

		
		/*
		 * Break statement within loops.
		 * 
		 * We already saw how we can use bireak within switch statement, it would exit the switch statement.
		 * 
		 * Similarly break within loops will force it to exit the loop. 
		 * 			Even if condition is still true
		 * 
		 * 
		 * 
		 * 			int n = 1;
		 * while(n < 10{
		 * 
		 * 	system.out.println("Hello from loop");
		 * 
		 * n++;
		 * if(n == 5 ) {
		 * break;
		 * }
		 * 
		 *}
		 *
		 */
		
		
		
		Scanner scan = new Scanner(System.in);

		// Random is a class
		// the purpose of this class is to generate random numbers

		Random random = new Random();

		// give me random number 0 - 9

		int secretNumber = random.nextInt(100);

		int guessedNumber;

		// only 5 change to guesses
		int iTries = 0;
		do {

			System.out.println("Guess The Number");
			guessedNumber = scan.nextInt();
			
			iTries++;

			if (guessedNumber == secretNumber) {
				System.out.println("Congratulations !! You Won !");
				break;
			} else if (guessedNumber > secretNumber) {
				System.out.println("Too large");
			} else {
				System.out.println("Too small");
			}

			if (iTries == 5) {
				System.out.println("You lost");
				System.out.println("Secret Number is: " + secretNumber);
				break;
			}

		} while (secretNumber != guessedNumber && iTries <= 5);
				scan.close();
	}

}
