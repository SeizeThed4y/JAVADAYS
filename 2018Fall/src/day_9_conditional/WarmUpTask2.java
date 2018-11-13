package day_9_conditional;

import java.util.Scanner;

public class WarmUpTask2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the x number");
		int x = scan.nextInt();
		System.out.println("please enter the y number");
		int y = scan.nextInt();
		System.out.println("pleae enter z number");
		int z = scan.nextInt();
		if (x > y && x > z) {
			System.out.println("X is the bigger number");
		} else if (y > x && y > z) {
			System.out.println("Y is the bigger number");
		} else if (z > x && z > y) {
			System.out.println("Z is the bigger number");
		}else if(x == y || x != z && y != z) {
			System.out.println("X and Y are equal and Z is the biggest number");
		}else {
			System.out.println("All numbers are equal");
		}

		scan.close();

	}

}
