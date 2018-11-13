package day_8_contionals2;

import java.util.Scanner;

public class WarmUpTaskIfandElseStatement {

	public static void main(String[] args) {
		/*
		 * Write a program that asks a student what is their Batch number. if that is
		 * 10, say - " We are Classmates!" If not , say something else
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("What is your batch ? ");
		int batch = scan.nextInt();

		if (batch == 10) {
			System.out.println("We are classmates !!");
		} else {
			System.out.println("Oh we are in diffrent classes");
		}

		scan.close();

	}

}
