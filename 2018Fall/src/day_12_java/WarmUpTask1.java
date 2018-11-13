package day_12_java;

import java.util.Scanner;

public class WarmUpTask1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the start point");
		char startPoint = scan.next().charAt(0);
		System.out.println("Please enter the destination point");
		char destionationPoint = scan.next().charAt(0);

		switch (startPoint) {
		case 'A':
		case 'a':
			if (startPoint == destionationPoint) {
				System.out.println("Already there");

			} else if (destionationPoint == 'B') {
				System.out.println("Go Right");
			} else if (destionationPoint == 'b') {
				System.out.println("Go right");
			} else if (destionationPoint == 'C') {
				System.out.println("go right and down");
			} else if (destionationPoint == 'c') {
				System.out.println("go right and down");
			} else if (destionationPoint == 'D') {
				System.out.println("go right, go down , go left");
			} else if (destionationPoint == 'd') {
				System.out.println("go right , go down , go left");
			}
		case 'B':
		case 'b':
			if (startPoint == destionationPoint) {
				System.out.println("Already there");

			} else if (destionationPoint == 'A') {
				System.out.println("Go left");
			} else if (destionationPoint == 'a') {
				System.out.println("Go left");
			} else if (destionationPoint == 'C') {
				System.out.println("go down");
			} else if (destionationPoint == 'c') {
				System.out.println("go down");
			} else if (destionationPoint == 'D') {
				System.out.println("go down , go left");
			} else if (destionationPoint == 'd') {
				System.out.println("go down , go left");
			}
			break;
		case 'C':
		case 'c':
			if (startPoint == destionationPoint) {
				System.out.println("Already there");

			} else if (destionationPoint == 'A') {	
				System.out.println("Go up , go left");
			} else if (destionationPoint == 'a') {
				System.out.println("Go up , go left");
			} else if (destionationPoint == 'B') {
				System.out.println("go up");
			} else if (destionationPoint == 'b') {
				System.out.println("go up");
			} else if (destionationPoint == 'D') {
				System.out.println("go left");
			} else if (destionationPoint == 'd') {
				System.out.println("go left");
			}
			break;
		case 'D':
		case 'd':
			if (startPoint == destionationPoint) {
				System.out.println("Already there");

			} else if (destionationPoint == 'A') {
				System.out.println("Go up");
			} else if (destionationPoint == 'a') {
				System.out.println("Go up");
			} else if (destionationPoint == 'C') {
				System.out.println("go right ");
			} else if (destionationPoint == 'c') {
				System.out.println("go right ");
			} else if (destionationPoint == 'B') {
				System.out.println("go right, go up");
			} else if (destionationPoint == 'b') {
				System.out.println("go right , go up");
			}
			break;
		default:
			System.out.println("invalid data");

		}

		scan.close();

	}
}
