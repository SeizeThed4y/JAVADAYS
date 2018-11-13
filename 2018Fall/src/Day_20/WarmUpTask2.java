package Day_20;

import java.util.Scanner;

public class WarmUpTask2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First start");
		int startNum = scan.nextInt();
		System.out.println("Enter Second end");
		int endNum = scan.nextInt();

		while (startNum >= endNum) {
			System.out.println("Step " + startNum);
			startNum--;
		}
		scan.close();
	}

}
