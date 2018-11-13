package Day_32_methodswithreturn01;

import java.util.Scanner;

public class MethodGetMax3Version2 {
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

		int myNumber = getMax32(num1, num2, num3);

		System.out.println("Largest number is : " + myNumber);
	}

	public static int getMax32(int num1, int num2, int num3) {

		if (num1 > num2 && num1 > num3) {
			return num1;

		} else if (num2 > num1 && num2 > num3) {
			return num2;

		} else {
			return num3;
		}

	}
		
}
