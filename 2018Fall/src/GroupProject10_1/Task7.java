package GroupProject10_1;

public class Task7 {

	public static void main(String[] args) {

		int result = 0;

		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {

				result += i;
				// result = result + i;

			}
		}
		System.out.println("Sum: " + result);
////////////////////
		int number = 0;
		int result2 = 0;

		while (number <= 20) {

			if (number % 2 == 0) {

				result2 += number;
				
			}
			number++;
		}
		System.out.println("Sum: " + result2);
		
		
	}

}
