package practicepublic;

import java.util.Scanner;

public class SpeedLimitAndYourSpeed {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Speed Limit");
		int spl = scan.nextInt();

		System.out.println("Enter Your Current Speed");
		int ycs = scan.nextInt();

		if (ycs > spl) {
			if ((ycs - spl) <= 10) {
				System.out.println("You dont get ticket");
			}

			else {
				System.out.println("you get ticket");
			}

			scan.close();
		} else if (spl == ycs) {
			System.out.println("You are a safe driver");
		} else if (spl > ycs) {
			System.out.println("You need to speed up, you are causing traffic");
		}
	}

}
