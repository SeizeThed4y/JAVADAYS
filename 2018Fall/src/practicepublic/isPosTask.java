package practicepublic;

import java.util.Scanner;

public class isPosTask {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {

			arr[i] = inp.nextInt();
		}
		int num = 0;
		for(int i = 0; i < arr.length; i++) {
			num = arr[i];
			
			isPos(num);
		}
	}

	public static void isPos(int num) {
		
	
		
		if( num > 0) {
			System.out.println("is Positive");
		}else {
			System.out.println("No positive");
		}
		
	}
}
