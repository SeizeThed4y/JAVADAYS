package practicepublic;

import java.util.Scanner;

public class SecondCalPracticeRamainder {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter The Second");

		int second = scan.nextInt();

		int hours, min, leftOverSecond;

		hours = second / 3600;
		second %= 3600;

		System.out.println("Hours: " + hours);

		min = second / 60;
		second %= 60;

		System.out.println("Minutes: " + min);

		leftOverSecond = second;

		System.out.println("Second = " + leftOverSecond);

		scan.close();

	}

}
