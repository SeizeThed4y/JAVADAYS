package Day_32_methodswithreturn01;

import java.util.Scanner;

public class MethodGetMax3 {
	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First Number");
		num1 = scan.nextInt();
		System.out.println("Enter Second Number");
		num2 = scan.nextInt();
		System.out.println("Enter Third Number");
		num3 = scan.nextInt();

		int myNumber = getMax(num1, num2, num3);

		System.out.println("Largest number is : " + myNumber);

	}

	public static int getMax(int num1, int num2, int num3) {

		int largest = 0;

		if (num1 > num2 && num1 > num3) {
			largest = num1;

		} else if (num2 > num1 && num2 > num3) {
			largest = num2;
		} else {
			largest = num3;
		}

		return largest;

	}

}
