package day_9_conditional;

import java.util.Scanner;

public class WarmUpTask2Ver2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the x number");
		int x = scan.nextInt();
		System.out.println("please enter the y number");
		int y = scan.nextInt();
		System.out.println("pleae enter z number");
		int z = scan.nextInt();
		int max;
		
		if (x > y && x > z) {
			max = x;
		} else if (y > x && y > z) {
			max = y;
		} else if (z > x && z > y) {
			max = z;
			
			System.out.println("Max: " + max);
		}else {
			System.out.println("All numbers are equal");
		}

		scan.close();
	}

}
