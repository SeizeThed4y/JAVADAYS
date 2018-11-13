package practicepublic;

public class DoWhileLoopPractice {
	public static void main(String[] args) {
		int apples = 1;
		// int totalApples = 10; // does work because its outside of do { } 
		do {
			System.out.println("Eating an apple" + " " +apples);

			apples++;

			//int totalApples = 10; // doesnt work because its in do {}

		} while (apples <= 10);

		System.out.println("No more Apples :( ");
	}
}
