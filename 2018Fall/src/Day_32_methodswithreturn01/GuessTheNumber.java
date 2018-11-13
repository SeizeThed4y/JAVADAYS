package Day_32_methodswithreturn01;

import java.util.Random;

public class GuessTheNumber {

	// playGuessNumComputerOnly ();

	// playGuessNumLimit(int limit)

	// playGuessNumComputerVsMe(int secretNum);

	public static void main(String[] args) throws InterruptedException {
		playGuessNumComputerOnly();
		
		sayHi();
		sayHi(2);

	}

	public static void playGuessNumComputerOnly() throws InterruptedException {

		Random random = new Random();

		int secretNumber = random.nextInt(3);

		int guessNumber = 0;
		int limit = 3;
		int counter = 0;
		do {
			counter++;
			System.out.println("Guess the secret number");
			guessNumber = random.nextInt(21);
			System.out.println("Guessing " + guessNumber + " Counter: " + counter);
			Thread.sleep(500);
			// check if secretNumber matches guessNumber

			if (limit == counter) {
				System.out.println("!!!!!!    Wow you lost     !!!!!!");
				break;
			}

			if (secretNumber == guessNumber) {
				System.out.println("You Won! Guessed the Secret Number ! in " + counter + " times");

				break;
			} else {
				System.out.println("Wrong ! Try again");
				// Thread.sleep(500);
			}

		} while (true);

	}

	// 2 methods with same name and parameter list cannot be defined in same class.
	
	
	
	//Blow codes will work because even the class names are same because 2nd class has different parameter and it will work .	
	public static void sayHi(){
		
		System.out.println("Hi");
		
	}
	
	public static void sayHi(int n) {
		
		for(int i = 0; i < n; i++) {
			System.out.println("hi");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
