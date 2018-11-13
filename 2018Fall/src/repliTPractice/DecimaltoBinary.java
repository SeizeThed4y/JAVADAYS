package repliTPractice;

import java.util.Arrays;
import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int decimal = input.nextInt();
		int[] binary = new int[8];
		int count = 0;
		
		while (decimal > 0) {
			binary[binary.length-1-count] = decimal % 2;
			decimal /= 2;
			count++;
	}
		System.out.println(Arrays.toString(binary));

}
}
