package Day_32_methodswithreturn01;

import java.util.Scanner;

public class MethodGetMax {
	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First Number");
		num1 = scan.nextInt();
		System.out.println("Enter Second Number");
		num2 = scan.nextInt();

		int myNumber = getMax(num1, num2);

		System.out.println("Largest number is : " + myNumber);

		// System.out.println("Largest number is " + getMax(3, 2));

	}

	// Method getMax that Accepts 2 ints and return larger

	public static int getMax(int num1, int num2) {

		int largest = 0;

		if (num1 > num2) {
			largest = num1;

		} else  if (num2 > num1) {
			largest = num2;
		}else { 
			System.out.println("Numbers are equal");
		}

		return largest;

	}

}
