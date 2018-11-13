package Day_20;

public class Continue {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			if (i > 2) {
				break;
			}
		}

		for (int k = 0; k <= 10; k++) {
			if (k == 1 || k == 2) {

			}
			System.out.println("Valuke of k: " + k);
		}

		/*
		 * loop through number from 1 to 50 print each number in same line , separated
		 * by space if( a number is divisible by 5 then skip it
		 * 
		 * if a number is divisible by 20 exit the loop
		 */

		for (int a = 1; a <= 50; a++) {

			if (a % 5 == 0) {
				continue;
			}
			if (a % 20 == 0) {
				break;

			}
			System.out.print(a + " ");
		}

	}

}
