package practicepublic;

import java.util.Scanner;

public class Practice9_7_2018IFandElse {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Current Speed");

		int currentSpeed = scan.nextInt();

		if (currentSpeed > 60) {
			System.out.println("Slow down");
			int diff = currentSpeed - 60;
			System.out.println("===================");

			System.out.println("The difference speed: " + diff);
			System.out.println("===================");

			System.out.println("The Speed Limit is: " + (currentSpeed -= diff));
			System.out.println("===================");
		}

		else {
			System.out.println("Keep Driving");
		}

		System.out.println("===================");
		System.out.println("Your 2nd current speed is " + currentSpeed);

		scan.close();

	}
}
