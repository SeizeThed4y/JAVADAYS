package day_8_contionals2;

import java.util.Scanner;

public class Warmup2IfandElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Pincode ");
		int pincode = scan.nextInt();

		int pincode1 = 123;

		if (pincode == pincode1) {
			System.out.println("Access Granted, Welcome !!");
		} else {
			System.out.println("Access, Denied !!");
		}
		scan.close();
	}

}
