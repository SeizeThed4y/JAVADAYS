package Day_22;

public class NestedLoopExample {

	public static void main(String[] args) {

		/*
		 * "i" loop will print 1 to 10 but because of "j" loop
		 * 
		 * "i" loop will print 5 times :
		 * 
		 * 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7
		 * 8 9 10 1 2 3 4 5 6 7 8 9 10
		 * 
		 */

//		for (int j = 1; j <= 5; j++) { 
//			for (int i = 1; i <= 10; i++) { 
//				System.out.print(i + " ");
//
//			}
//			System.out.println();
//		}
//
//		System.out.println("Outside the loop");

		// MODIFY NESTED LOOPS ABOVE SO THAT IT PRINT THIS PATTERN

		for (int j = 1; j <= 10; j++) {
			for (int i = 1; i <= j; i++) {
				// in the first place j is 1 and j is running until 10 so its print
				// 1
				// 1 2
				// 1 2 3
				// 1 2 3 4
				// 1 2 3 4 5
				// 1 2 3 4 5 6
				// 1 2 3 4 5 6 7
				// 1 2 3 4 5 6 7 8
				// 1 2 3 4 5 6 7 8 9
				// 1 2 3 4 5 6 7 8 9 10
				System.out.print(i + " ");

			}
			System.out.println();
		}

		// System.out.println("Outside the loop");

		System.out.println("1");

		for (int g = 10; g >= 1; g--) {
			for (int h = 1; h <= g; h++) {
				System.out.print(h + " ");
			}
			System.out.println();
		}

		// 1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 5 6 7 8 9
		// 1 2 3 4 5 6 7 8
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5 6
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1

	}

}
