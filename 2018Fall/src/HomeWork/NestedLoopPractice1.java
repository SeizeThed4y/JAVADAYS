package HomeWork;

public class NestedLoopPractice1 {

	public static void main(String[] args) {
		
		/*
		 *  1 
			1 2 
			1 2 3 
			1 2 3 4 
			1 2 3 4 5 
			1 2 3 4 5 6 
			1 2 3 4 5 6 7 
			1 2 3 4 5 6 7 8 
			1 2 3 4 5 6 7 8 9 
			1 2 3 4 5 6 7 8 9 10 
			1 2 3 4 5 6 7 8 9 10 
			1 2 3 4 5 6 7 8 9 
			1 2 3 4 5 6 7 8 
			1 2 3 4 5 6 7 
			1 2 3 4 5 6 
			1 2 3 4 5 
			1 2 3 4 
			1 2 3 
			1 2 
			1
			1 2 
			1 2 3 
			1 2 3 4 
			1 2 3 4 5 
			1 2 3 4 5 6 
			1 2 3 4 5 6 7 
			1 2 3 4 5 6 7 8 
			1 2 3 4 5 6 7 8 9 
			1 2 3 4 5 6 7 8 9 10 
			1 2 3 4 5 6 7 8 9 10 
			1 2 3 4 5 6 7 8 9 
			1 2 3 4 5 6 7 8 
			1 2 3 4 5 6 7 
			1 2 3 4 5 6 
			1 2 3 4 5 
			1 2 3 4 
			1 2 3 
			1 2 
			1  

		 * 
		 */
		
		
		

		for (int j = 1; j <= 10; j++) { 
			for (int i = 1; i <= j; i++) { 
				System.out.print(i + " ");

			}
			System.out.println();
		}
		
		for (int g = 10; g >= 1; g--) {
			for(int h = 1; h <= g; h++) {
				System.out.print(h+" ");
			}
			System.out.println();
		}
		
		
		
		
		for (int f = 1; f <= 10; f++) { 
			for (int i = 1; i <= f; i++) { 
				System.out.print(i + " ");

			}
			System.out.println();
		}
		
		for (int q = 10; q >= 1; q--) {
			for(int h = 1; h <= q; h++) {
				System.out.print(h+" ");
			}
			System.out.println();
		}
		

	}

}
