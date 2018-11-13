package practicepublic;

import java.util.Scanner;

public class CalculatePhoneBill {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the amount call");
		int amountCall = scan.nextInt();

		double bill = 0;

		if (amountCall <= 100) {
			bill = 200.0;

			System.out.println("Your Bill is: $" + bill);
		} else if (amountCall <= 150 && amountCall > 100) {
			bill = ((amountCall - 100) * 0.60 + 200);

			System.out.println("Your Bill is: $" + bill);
		} else if (amountCall <= 200 && amountCall > 150) {
			bill = ((amountCall - 150) * 0.50) + (0.60 * 50) + 200;

			System.out.println("Your Bill is $" + bill);
		} else if (amountCall > 200) {
			bill = ((amountCall - 200) * 0.40) * (0.50 * 50) + (0.60 * 50) + 200;
			System.out.println("Your bill is: $" + bill);
		}
		scan.close();
	}
}