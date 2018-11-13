package MentoringWithAkpar01;

public class ArrayPractice {
	public static void main(String[] args) {

		/*
		 * Task 1
		 * 
		 * Create an 3 array of 4 items
		 * 
		 * use the 3 different way that we just saw in slide
		 * 
		 * 
		 * optionally loop through everything and print it out
		 * 
		 */

		int[] num1 = { 1, 2, 3, 4 };
		int[] num2 = new int[] { 5, 6, 7, 8 };

		int[] num3 = new int[4];
		num3[0] = 9;
		num3[1] = 10;
		num3[2] = 11;
		num3[3] = 12;

		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
		System.out.println();
		for (int n1 : num1) {
			System.out.print(n1 + " ");
		}
		System.out.println();
		int j = 0;
		while (j < num1.length) {

			System.out.print(num1[j] + " ");
			j++;
		}
		
		System.out.println();
		
		
		
		int idx = 0;
		do {
			
			System.out.print(num1[idx] + " " + idx);
			//idx++;
			
		}while(++idx < num1.length);
		
		

	}
}
